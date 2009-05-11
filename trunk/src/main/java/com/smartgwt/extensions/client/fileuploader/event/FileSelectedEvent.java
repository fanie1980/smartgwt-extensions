/*
 * SmartGWT Extensions Copyright (c) 2009, Hang (Anthony) Yuan.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.smartgwt.extensions.client.fileuploader.event;

import com.google.gwt.event.shared.GwtEvent;
import com.smartgwt.extensions.client.fileuploader.FileUploadInput;

/**
 * Fired when file is added into the queue.
 * 
 * @author anthony.yuan@gmail.com
 */
public class FileSelectedEvent extends GwtEvent<FileSelectedHandler> {

	/**
	 * Handler type.
	 */
	private static Type<FileSelectedHandler> TYPE;

	public static Type<FileSelectedHandler> getType() {
		if (TYPE == null) {
			TYPE = new Type<FileSelectedHandler>();
		}
		return TYPE;
	}

	private FileUploadInput fileUploadInput;
	private String filename;

	public FileSelectedEvent(FileUploadInput fileUploader, String filename) {
		this.fileUploadInput = fileUploader;
		this.filename = filename;
	}

	public FileUploadInput getFileUploadInput() {
		return fileUploadInput;
	}

	public String getFilename() {
		return filename;
	}

	@Override
	protected void dispatch(FileSelectedHandler handler) {
		handler.onSelect(this);
	}

	@Override
	public GwtEvent.Type<FileSelectedHandler> getAssociatedType() {
		return getType();
	}

}
