package com.tempest.travelsecretary.job;
import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.tempest.travelsecretary.action.JiyiyuanAction;

import java.text.SimpleDateFormat;
import java.util.Date;
 
/**
 * 同步用户信息Job
 * @author pan_junbiao
 **/
public class SyncUserJob extends QuartzJobBean
{
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext)
    {
        //获取JobDetail中传递的参数
        //String userName = (String) jobExecutionContext.getJobDetail().getJobDataMap().get("userName");
        //String blogUrl = (String) jobExecutionContext.getJobDetail().getJobDataMap().get("blogUrl");
        //String blogRemark = (String) jobExecutionContext.getJobDetail().getJobDataMap().get("blogRemark");
 
        //获取当前时间
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        //System.out.println(dateFormat.format(date));
        //JiyiyuanAction.refresh();
    }
}

