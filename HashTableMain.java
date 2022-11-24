package com.bridgelab.hash_table;

import java.util.Hashtable;

public class HashTableMain {
	public static void main(String[] args) {
		System.out.println("Welcome in Hash Tables program");
		HashTableImpl<String, Integer> hashImpl = new HashTableImpl();
		String message = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		message = message.replace("avoidable", "");
		String[] messageArray = message.toLowerCase().split(" ");

		for (String word : messageArray) {
			Integer value = hashImpl.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			hashImpl.add(word, value);

		}
			System.out.println(hashImpl);
	}
}
