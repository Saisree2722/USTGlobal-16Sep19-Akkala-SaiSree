package com.ustglobal.hasarelation.weak;

public class TestB
{
  public static void main(String[] args) 
 {
	MusicSystem m = new MusicSystem();
	System.out.println(m.songname);
	m.listen();
	m.musicPlays();
	System.out.println("=========================");
	m.c.drive();
 }
}
