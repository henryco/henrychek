package dev.tindersamurai.henrychek.starter;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

public interface ApplicationStarter {

	@EventListener
	void onStartUp(ApplicationStartedEvent event);
}
