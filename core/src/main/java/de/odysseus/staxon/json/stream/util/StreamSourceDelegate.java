/*
 * Copyright 2011, 2012 Odysseus Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.odysseus.staxon.json.stream.util;

import java.io.IOException;

import de.odysseus.staxon.json.stream.JsonStreamSource;
import de.odysseus.staxon.json.stream.JsonStreamToken;

/**
 * Delegating stream source.
 */
public class StreamSourceDelegate implements JsonStreamSource {
	/*
	 * delegate source
	 */
	private final JsonStreamSource delegate;

	public StreamSourceDelegate(JsonStreamSource delegate) {
		this.delegate = delegate;
	}

	@Override
	public void close() throws IOException {
		delegate.close();
	}

	@Override
	public int getLineNumber() {
		return delegate.getLineNumber();
	}

	@Override
	public int getColumnNumber() {
		return delegate.getColumnNumber();
	}

	@Override
	public String name() throws IOException {
		return delegate.name();
	}

	@Override
	public int getCharacterOffset() {
		return delegate.getCharacterOffset();
	}

	@Override
	public String value() throws IOException {
		return delegate.value();
	}

	@Override
	public void startObject() throws IOException {
		delegate.startObject();
	}

	@Override
	public String getPublicId() {
		return delegate.getPublicId();
	}

	@Override
	public void endObject() throws IOException {
		delegate.endObject();
	}

	@Override
	public String getSystemId() {
		return delegate.getSystemId();
	}

	@Override
	public void startArray() throws IOException {
		delegate.startArray();
	}

	@Override
	public void endArray() throws IOException {
		delegate.endArray();
	}

	@Override
	public JsonStreamToken peek() throws IOException {
		return delegate.peek();
	}	
}