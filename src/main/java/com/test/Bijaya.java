package com.test;

import com.clinicast.utils.Utils;

public class Bijaya {
	private String name;
	private Integer friendNameSize;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(Utils.daysBetween(new Date(),new Date()));
	}

	public Integer getFriendNameSize() {
		return friendNameSize;
	}

	public void setFriendNameSize(Integer friendNameSize) {
		this.friendNameSize = friendNameSize;
	}
}
