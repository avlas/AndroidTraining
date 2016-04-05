package com.zoo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zoo.R;

public class UserContent {

	public static List<User> USERS = new ArrayList<User>();

	public static Map<String, User> USER_MAP = new HashMap<String, User>();

	static {
		addUser(new User("1","Tete", "Titi", R.drawable.nature, false));
		addUser(new User("2","Titi", "Toto", R.drawable.nature, true));
		addUser(new User("3","Toto", "Tutu", R.drawable.nature, true));
		addUser(new User("4","Tutu", "Tata", R.drawable.nature, false));
	}

	private static void addUser(User user) {
		USERS.add(user);
		USER_MAP.put(user.id, user);
	}
}
