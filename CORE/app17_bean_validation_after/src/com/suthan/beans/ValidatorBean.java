package com.suthan.beans;

import javax.swing.text.Position;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ValidatorBean implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object  bean, String beanName) throws BeansException {
	
		String uname_err_messgae = "";
		String upwd_err_messgae = "";
		String uage_err_messgae = "";
		String uemail_err_messgae = "";
		String umobile_err_messgae = "";
		boolean status = true;
		try {
			// getting data bean object 
			User user = (User) bean;
			String uname= user.getUname();
			String upwd = user.getUpwd();
			int uage =user.getAge();
			String uemail = user.getUemail();
			String umobile = user.getUmobile();
			
			if(uname == null || uname.equals("")) {
				uname_err_messgae  = "uname is required";
				status =false;
			}
			if(upwd == null || upwd.equals("")) {
				upwd_err_messgae  = "upwd is required";
				status =false;
			}
			if(uage == 0){
				uage_err_messgae  = "user age  is required";
				status =false;
			}
			if(umobile == null || umobile.equals("")) {
				umobile_err_messgae  = "umobileis required";
				status =false;
			}
			
			if(uemail == null || uemail.equals("")) {
				uemail_err_messgae  = "uemail is required";
				status =false;
			}
			
			if(status == false) {
				System.out.println(uname_err_messgae);
				System.out.println(upwd_err_messgae);
				System.out.println(uage_err_messgae );
				System.out.println(uemail_err_messgae);
				System.out.println(umobile_err_messgae );
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

}
