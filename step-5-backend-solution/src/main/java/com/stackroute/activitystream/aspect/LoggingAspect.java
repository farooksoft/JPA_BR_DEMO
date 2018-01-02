package com.stackroute.activitystream.aspect;

import org.aspectj.lang.annotation.Aspect;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(* com.stackroute.activitystream.service.CircleService.save(..))")
	public void logBeforeCreateCircle(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.CircleService.save(..))")
	public void logAfterCreateCircle(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.CircleService.save(..))", returning = "result")
	public void logAfterReturningCreateCircle(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.CircleService.save(..))", throwing = "error")
	public void logAfterThrowingCreateCircle(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.CircleService.getAllCircles(..))")
	public void logBeforeGetAllCircles(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.CircleService.getAllCircles(..))")
	public void logAfterGetAllCircles(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.CircleService.getAllCircles(..))", returning = "result")
	public void logAfterReturningGetAllCircles(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.CircleService.getAllCircles(..))", throwing = "error")
	public void logAfterThrowingGetAllCircles(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.CircleService.get(..))")
	public void logBeforeGet(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.CircleService.get(..))")
	public void logAfterGet(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.CircleService.get(..))", returning = "result")
	public void logAfterReturningGet(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.CircleService.get(..))", throwing = "error")
	public void logAfterThrowingGet(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.CircleService.delete(..))")
	public void logBeforeDelete(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.CircleService.delete(..))")
	public void logAfterDelete(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.CircleService.delete(..))", returning = "result")
	public void logAfterReturningDelete(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.CircleService.delete(..))", throwing = "error")
	public void logAfterThrowingDelete(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageService.getMessagesFromCircle(..))")
	public void logBeforeGetMessagesFromCircle(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageService.getMessagesFromCircle(..))")
	public void logAfterGetMessagesFromCircle(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.getMessagesFromCircle(..))", returning = "result")
	public void logAfterReturningGetMessagesFromCircle(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.getMessagesFromCircle(..))", throwing = "error")
	public void logAfterThrowingGetMessagesFromCircle(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageService.getMessagesFromUser(..))")
	public void logBeforeGetMessagesFromUser(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageService.getMessagesFromUser(..))")
	public void logAfterGetMessagesFromUser(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.getMessagesFromUser(..))", returning = "result")
	public void logAfterReturningGetMessagesFromUser(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.getMessagesFromUser(..))", throwing = "error")
	public void logAfterThrowingGetMessagesFromUser(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageService.sendMessageToCircle(..))")
	public void logBeforeSendMessageToCircle(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageService.sendMessageToCircle(..))")
	public void logAfterSendMessageToCircle(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.sendMessageToCircle(..))", returning = "result")
	public void logAfterReturningSendMessageToCircle(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.sendMessageToCircle(..))", throwing = "error")
	public void logAfterThrowingSendMessageToCircle(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageService.sendMessageToUser(..))")
	public void logBeforeSendMessageToUser(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageService.sendMessageToUser(..))")
	public void logAfterSendMessageToUser(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.sendMessageToUser(..))", returning = "result")
	public void logAfterReturningSendMessageToUser(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.sendMessageToUser(..))", throwing = "error")
	public void logAfterThrowingSendMessageToUser(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageService.listTags(..))")
	public void logBeforeListTags(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageService.listTags(..))")
	public void logAfterListTags(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.listTags(..))", returning = "result")
	public void logAfterReturningListTags(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.listTags(..))", throwing = "error")
	public void logAfterThrowingListTags(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageService.listTags(..))")
	public void logBeforeListMyTags(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageService.listTags(..))")
	public void logAfterListMyTags(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.listMyTags(..))", returning = "result")
	public void logAfterReturninglistMyTags(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.listMyTags(..))", throwing = "error")
	public void logAfterThrowingListMyTags(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageService.showMessagesWithTag(..))")
	public void logBeforeShowMessagesWithTag(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageService.showMessagesWithTag(..))")
	public void logAfterShowMessagesWithTag(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.showMessagesWithTag(..))", returning = "result")
	public void logAfterReturningShowMessagesWithTag(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.showMessagesWithTag(..))", throwing = "error")
	public void logAfterThrowingShowMessagesWithTag(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageService.subscribeUserToTag(..))")
	public void logBeforeSubscribeUserToTag(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageService.subscribeUserToTag(..))")
	public void logAfterSubscribeUserToTag(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.subscribeUserToTag(..))", returning = "result")
	public void logAfterReturningSubscribeUserToTag(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.subscribeUserToTag(..))", throwing = "error")
	public void logAfterThrowingSubscribeUserToTag(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.MessageService.unsubscribeUserToTag(..))")
	public void logBeforeUnsubscribeUserToTag(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.MessageService.unsubscribeUserToTag(..))")
	public void logAfterUnsubscribeUserToTag(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.unsubscribeUserToTag(..))", returning = "result")
	public void logAfterReturningUnsubscribeUserToTag(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.MessageService.unsubscribeUserToTag(..))", throwing = "error")
	public void logAfterThrowingUnsubscribeUserToTag(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserCircleService.addUser(..))")
	public void logBeforeAddUser(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserCircleService.addUser(..))")
	public void logAfterAddUser(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserCircleService.addUser(..))", returning = "result")
	public void logAfterReturningAddUser(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserCircleService.addUser(..))", throwing = "error")
	public void logAfterThrowingAddUser(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserCircleService.removeUser(..))")
	public void logBeforeRemoveUser(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserCircleService.removeUser(..))")
	public void logAfterRemoveUser(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserCircleService.removeUser(..))", returning = "result")
	public void logAfterReturningRemoveUser(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserCircleService.removeUser(..))", throwing = "error")
	public void logAfterThrowingRemoveUser(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserCircleService.getMyCircles(..))")
	public void logBeforeGetMyCircles(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserCircleService.getMyCircles(..))")
	public void logAfterGetMyCircles(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserCircleService.getMyCircles(..))", returning = "result")
	public void logAfterReturningGetMyCircles(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserCircleService.getMyCircles(..))", throwing = "error")
	public void logAfterThrowingGetMyCircles(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserCircleService.get(..))")
	public void logBeforeGetCircle(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserCircleService.get(..))")
	public void logAfterGetCircle(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserCircleService.get(..))", returning = "result")
	public void logAfterReturningGetCircle(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserCircleService.get(..))", throwing = "error")
	public void logAfterThrowingGetCircle(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserService.save(..))")
	public void logBeforeSaveUser(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserService.save(..))")
	public void logAfterSaveUser(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserService.save(..))", returning = "result")
	public void logAfterReturningSaveUser(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserService.save(..))", throwing = "error")
	public void logAfterThrowingSaveUser(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserService.update(..))")
	public void logBeforeUpdateUser(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserService.update(..))")
	public void logAfterUpdateUser(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserService.update(..))", returning = "result")
	public void logAfterReturningUpdateUser(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserService.update(..))", throwing = "error")
	public void logAfterThrowingUpdateUser(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserService.delete(..))")
	public void logBeforeDeleteUser(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserService.delete(..))")
	public void logAfterDeleteUser(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserService.delete(..))", returning = "result")
	public void logAfterReturningDeleteUser(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserService.delete(..))", throwing = "error")
	public void logAfterThrowingDeleteUser(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserService.list(..))")
	public void logBeforeListAllUsers(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserService.list(..))")
	public void logAfterListAllUsers(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserService.list(..))", returning = "result")
	public void logAfterReturningListAllUsers(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserService.list(..))", throwing = "error")
	public void logAfterThrowingListAllUsers(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserService.validate(..))")
	public void logBeforeValidateUser(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserService.validate(..))")
	public void logAfterValidateUser(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserService.validate(..))", returning = "result")
	public void logAfterReturningValidateUser(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserService.validate(..))", throwing = "error")
	public void logAfterThrowingValidateUser(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserService.get(..))")
	public void logBeforeGetUser(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserService.get(..))")
	public void logAfterGetUser(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserService.get(..))", returning = "result")
	public void logAfterReturningGetUser(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserService.get(..))", throwing = "error")
	public void logAfterThrowingGetUser(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}

	@Before("execution(* com.stackroute.activitystream.service.UserService.exists(..))")
	public void logBeforeExists(JoinPoint joinPoint) {
		logger.info("============@Before==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("*********************************");
	}

	@After("execution(* com.stackroute.activitystream.service.UserService.exists(..))")
	public void logAfterExists(JoinPoint joinPoint) {
		logger.info("============@After==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.service.UserService.exists(..))", returning = "result")
	public void logAfterReturningExists(JoinPoint joinPoint, Object result) {
		logger.debug("============@AfterReturning==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("*********************************");
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.service.UserService.exists(..))", throwing = "error")
	public void logAfterThrowingExists(JoinPoint joinPoint, Throwable error) {
		logger.info("============@AfterThrowing==========");
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
		logger.debug("*********************************");
	}
}
