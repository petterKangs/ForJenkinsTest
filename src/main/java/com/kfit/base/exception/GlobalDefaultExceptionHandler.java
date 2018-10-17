package com.kfit.base.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public void defaultErrorHandler(HttpServletRequest req, Exception e) {
		// // If the exception is annotated with @ResponseStatus rethrow it and
		// let
		// // the framework handle it - like the OrderNotFoundException example
		// // at the start of this post.
		// // AnnotationUtils is a Spring Framework utility class.
		// if (AnnotationUtils.findAnnotation(e.getClass(),
		// ResponseStatus.class) != null)
		// throw e;
		//
		// // Otherwise setup and send the user to a default error-view.
		// ModelAndView mav = new ModelAndView();
		// mav.addObject("exception", e);
		// mav.addObject("url", req.getRequestURL());
		// mav.setViewName(DEFAULT_ERROR_VIEW);
		// return mav;
		// ��ӡ�쳣��Ϣ��
		e.printStackTrace();
		System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");

		/*
		 * 
		 * ����json���ݻ���String���ݣ�
		 * 
		 * ��ô��Ҫ�ڷ����ϼ���ע�⣺@ResponseBody
		 * 
		 * ���return���ɡ�
		 */

		/*
		 * 
		 * ������ͼ��
		 * 
		 * ����һ��ModelAndView���ɣ�
		 * 
		 * Ȼ��return;
		 * 
		 * ������ͼ�ļ�(���磺error.html,error.ftl,error.jsp);
		 */

	}

}
