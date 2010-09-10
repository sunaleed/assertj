/*
 * Created on Sep 9, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.formatting;

import org.fest.util.Arrays;

/**
 * Returns the {@code String} representation of an {@code Object}. Internally this rule
 * calls the {@code toString()} method of the given {@code Object} or <code>{@link Arrays#format(Object)}</code> if the
 * given {@code Object} is an array.
 *
 * @author Alex Ruiz
 */
class ObjectToStringRule implements ToStringRule {

  public String toStringOf(Object o) {
    return o == null ? null : o.toString();
  }

  public boolean canHandle(Object o) {
    return false;
  }
}
