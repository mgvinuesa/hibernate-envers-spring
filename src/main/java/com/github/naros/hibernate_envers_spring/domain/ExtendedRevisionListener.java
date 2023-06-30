/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package com.github.naros.hibernate_envers_spring.domain;

import org.hibernate.envers.RevisionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.naros.hibernate_envers_spring.services.MyService;

/**
 * @author Chris Cranford
 */
public class ExtendedRevisionListener implements RevisionListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExtendedRevisionListener.class);

	@Autowired
	private MyService myService;

	public ExtendedRevisionListener() {
		LOGGER.info("Created revision listener implementation");
	}

	@Override
	public void newRevision(Object o) {
		LOGGER.info("New revision object created, listener called");
		if (myService != null) {
			LOGGER.info("MyService was injected successfully");
			myService.doSomething();
			return;
		} else {
			LOGGER.error("MyService was not injected.");
		}
	}
}
