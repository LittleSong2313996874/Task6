package com.ss.util.task;

import com.ss.cache.RedisCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务 
 */
@Component
public class Quartz {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RedisCache cache;

	/**
	 * 每隔30分钟定时清理缓存
	 */
	@Scheduled(cron = "0 0/30 * * * ? ")
	public void cacheClear() {
		LOG.info("@Scheduled-------cacheClear()，开始清理缓存");
		cache.clearCache();
	}

}
