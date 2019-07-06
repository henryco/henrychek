package dev.tindersamurai.henrychek.starter;

import dev.tindersamurai.henrychek.repositories.RepositorySource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.stereotype.Component;

@Component @Slf4j
public class DefaultStarter implements ApplicationStarter {

	private final RepositorySource sourceProvider;

	@Autowired
	public DefaultStarter(RepositorySource sourceProvider) {
		this.sourceProvider = sourceProvider;
	}

	@Override
	public void onStartUp(ApplicationStartedEvent event) {

	}
}
