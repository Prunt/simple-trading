/*
 * This file is part of SimpleTrading.
 * Copyright (c) 2015-2016 Matthias Werning
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.xaniox.simpletrading;

public enum Permissions {
		
    TRADE_ACCEPT("trade.accept"),
    TRADE_ACCEPT_SHIFT("trade.accept.shift"),
    TRADE_INITIATE("trade.initiate"),
    TRADE_INITIATE_SHIFT("trade.initiate.shift"),
    TRADE_DENY("trade.deny"),

	RELOAD("reload"), 
	SIGN("sign");
	
	private static final String PREFIX = "simpletrading.";
	private String subPermission;
	
	Permissions(String subPermission) {
		this.subPermission = subPermission;
	}
	
	public String getPermission() {
		return PREFIX + subPermission;
	}
	
}
