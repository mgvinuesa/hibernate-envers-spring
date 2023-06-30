/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package com.github.naros.hibernate_envers_spring.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Chris Cranford
 */
@Service
public class MyServiceImpl implements MyService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyServiceImpl.class);

	@Override
	public void doSomething() {
		LOGGER.info("*** doSomething() called successfully");
	}
}
