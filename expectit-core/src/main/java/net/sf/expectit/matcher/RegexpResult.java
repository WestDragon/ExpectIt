package net.sf.expectit.matcher;

/*
 * #%L
 * net.sf.expectit
 * %%
 * Copyright (C) 2014 Alexey Gavrilov
 * %%
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
 * #L%
 */

import java.util.regex.MatchResult;

/**
 * A result of matching a regular expression.
 */
class RegexpResult extends SimpleResult {
    public static final RegexpResult NEGATIVE = new RegexpResult(false, null, null);

    private final MatchResult delegate;

    public RegexpResult(boolean succeeded, String before, MatchResult regexpResult) {
        super(succeeded, before, null);
        delegate = regexpResult;
    }

    @Override
    public int start() {
        return delegate.start();
    }

    @Override
    public int start(int group) {
        return delegate.start(group);
    }

    @Override
    public int end() {
        return delegate.end();
    }

    @Override
    public int end(int group) {
        return delegate.end(group);
    }

    @Override
    public String group() {
        return delegate.group();
    }

    @Override
    public String group(int group) {
        return delegate.group(group);
    }

    @Override
    public int groupCount() {
        return delegate.groupCount();
    }
}