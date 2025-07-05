package com.mycompany.nlu;

import java.util.Scanner;

public class UgandaCounter {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the book description:");
String description = scanner.nextLine();

String lowerDesc = description.toLowerCase();
String keyword = "uganda";
int count = 0;

int index = lowerDesc.indexOf(keyword);
while (index != -1) {
count++;
index = lowerDesc.indexOf(keyword, index + keyword.length());
}

System.out.println("The word 'Uganda' appears " + count + " time(s) in the description.");
scanner.close();
}
}