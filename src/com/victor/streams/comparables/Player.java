package com.victor.streams.comparables;

public class Player implements Comparable<Player> {

	private String name;
	private int rank;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Player(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", rank=" + rank + "]";
	}

	public int compareTo(Player p) {
		return this.rank == p.rank ? 0 : this.rank > p.rank ? 1 : -1;
	}
}
