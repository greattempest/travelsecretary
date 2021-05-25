package com.tempest.travelsecretary.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tempest.travelsecretary.util.Mail;
import com.tempest.travelsecretary.util.ReadFile;
import com.tempest.travelsecretary.util.WriteFile;

@RestController
@RequestMapping("jiaoyiyuan")
public class JiyiyuanController {
	
	@RequestMapping(value = "/refresh", method = RequestMethod.GET)
    public String refresh(HttpServletRequest request, ModelMap map) {
		try {
			//String cookies="taihe_bi_sdk_uid=36e72756cdb30a416c769fa476566aae; ngacn0comUserInfo=GTmpest%09GTmpest%0939%0939%09%0910%0999%094%090%090%0961_1; ngacn0comUserInfoCheck=7c8629302481991edec0ef8f99ff0e96; ngacn0comInfoCheckTime=1621416479; ngaPassportUid=3276370; ngaPassportUrlencodedUname=GTmpest; lastvisit=1621416479; lastpath=/thread.php?searchpost=1&authorid=61078637; UM_distinctid=17983cda16e136-070a4182b113df-4c3f2c72-b6400-17983cda16f37d; _cnzz_CV30043604=forum%7Cfid706%7C0; bbsmisccookies=%7B%22uisetting%22%3A%7B0%3A1%2C1%3A1621478261%7D%2C%22pv_count_for_insad%22%3A%7B0%3A-132%2C1%3A1621443356%7D%2C%22insad_views%22%3A%7B0%3A2%2C1%3A1621443356%7D%7D; CNZZDATA30043604=cnzz_eid%3D213932325-1621412139-%26ntime%3D1621412139";
			String cookies = "UM_distinctid=16df733f26b3a8-0c6ae27b1fe39-3d375b01-1fa400-16df733f26c79f; taihe_bi_sdk_uid=cbd969cd52f5f62a6f7fe5069f57cc6c; ngaPassportUid=34337474; ngaPassportUrlencodedUname=%25BD%25D0%25C9%25A7%25B5%25C4%25C3%25A8; ngaPassportCid=Z8eu0qnv7911if6jl6d1alu112qt5v944g00oii6; ngacn0comUserInfo=%25BD%25D0%25C9%25A7%25B5%25C4%25C3%25A8%09%25E5%258F%25AB%25E9%25AA%259A%25E7%259A%2584%25E7%258C%25AB%0942%0942%09%09-10%0922902%094%090%090%0911_-300%2C22_30%2C61_16%2C39_30%2C85_15; CNZZDATA30043604=cnzz_eid%3D1054280295-1571806389-https%253A%252F%252Fwww.google.com%252F%26ntime%3D1574749354; taihe_bi_sdk_session=3f434363b5d97f0bbe5fb22ee06a1e25; ngacn0comUserInfoCheck=6bef3a1628f60ed226b2d9e40cf7b34a; ngacn0comInfoCheckTime=1574750138; lastvisit=1574750762; lastpath=/read.php?tid=19416263&_ff=436; bbsmisccookies=%7B%22uisetting%22%3A%7B0%3A1%2C1%3A1582092365%7D%2C%22pv_count_for_insad%22%3A%7B0%3A-160%2C1%3A1574787652%7D%2C%22insad_views%22%3A%7B0%3A2%2C1%3A1574787652%7D%7D; _cnzz_CV30043604=forum%7Cfid436%7C0";
			Map cookiesMap = convertCookie(cookies);
			//Document doc= Jsoup.parse(new URL("https://bbs.nga.cn/thread.php?searchpost=1&authorid=61078637"),(1000));
			Document doc = Jsoup.connect("https://bbs.nga.cn/thread.php?searchpost=1&authorid=61078637").cookies(cookiesMap).get();
			Elements tbodys = doc.getElementsByTag("tbody");
			Iterator<Element> tbody =  tbodys.iterator();
			String id="";
			String newid="";
			
			try {
				id=ReadFile.sendid();
				
				while(tbody.hasNext()) {
					Element ele = tbody.next();
					Element ele1 = ele.getElementsByClass("topic_content").first();
					Element content = ele1.getElementsByTag("span").last();
					String currentid = content.attr("id");
					//System.out.println(content.text());
					//System.out.println("id:"+currentid);
					if(newid.equals(""))
						newid=currentid;
					if(id.equals(currentid) ) break;
					else Mail.send(content.text());						
					
				}
				WriteFile.sendid(newid);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return "ERROR";
	}
	
	public HashMap<String, String> convertCookie(String cookie) {
		HashMap<String, String> cookiesMap = new HashMap<String, String>();
		String[] items = cookie.trim().split(";");
		for (String item:items) cookiesMap.put(item.split("=")[0], item.split("=")[1]);
		return cookiesMap;
	}
}
