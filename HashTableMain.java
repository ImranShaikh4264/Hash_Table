package com.bridgelab.hash_table;

public class HashTableMain {
	public static void main(String[] args) {
		System.out.println("Welcome in Hash Tables program");
		HashTableImpl<String, Integer> hashImpl = new HashTableImpl();
		String message = "To be or not to be";
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
