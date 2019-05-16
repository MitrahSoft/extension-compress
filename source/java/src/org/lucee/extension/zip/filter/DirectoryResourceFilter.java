/**
 *
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either 
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public 
 * License along with this library.  If not, see <http://www.gnu.org/licenses/>.
 * 
 **/
package org.lucee.extension.zip.filter;

import lucee.commons.io.res.Resource;
import lucee.commons.io.res.filter.ResourceFilter;

/**
 * accept only directories
 */
public final class DirectoryResourceFilter implements ResourceFilter {

	public final static DirectoryResourceFilter FILTER = new DirectoryResourceFilter();

	@Override
	public boolean accept(Resource pathname) {
		return pathname.isDirectory();
	}

}