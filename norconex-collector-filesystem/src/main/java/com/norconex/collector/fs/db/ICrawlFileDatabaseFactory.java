/* Copyright 2010-2014 Norconex Inc.
 * 
 * This file is part of Norconex Filesystem Collector.
 * 
 * Norconex Filesystem Collector is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Norconex Filesystem Collector is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Norconex Filesystem Collector. If not, 
 * see <http://www.gnu.org/licenses/>.
 */
package com.norconex.collector.fs.db;

import java.io.Serializable;

import com.norconex.collector.core.ref.store.IReferenceStore;
import com.norconex.collector.fs.crawler.CrawlFile;
import com.norconex.collector.fs.crawler.FilesystemCrawlerConfig;

public interface ICrawlFileDatabaseFactory extends Serializable {

    IReferenceStore<CrawlFile> createCrawlURLDatabase(
            FilesystemCrawlerConfig config, boolean resume);
    
}
