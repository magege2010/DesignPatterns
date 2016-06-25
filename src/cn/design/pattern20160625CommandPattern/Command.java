package cn.design.pattern20160625CommandPattern;

public abstract class Command {

	protected Man man = new Man();
	protected Woman woman = new Woman();
	
	public abstract void executeBossCommand();
}
