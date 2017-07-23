/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ajoberstar.grgit

import groovy.transform.Canonical

/**
 * Credentials to use for remote operations.
 * @since 0.2.0
 */
@Canonical
class Credentials {
  final String username
  final String password

  Credentials(String username, String password) {
    this.username = username;
    this.password = password;
  }

  String getUsername() {
    return username ?: ''
  }

  String getPassword() {
    return password ?: ''
  }

  boolean isPopulated() {
    return username != null
  }
}
