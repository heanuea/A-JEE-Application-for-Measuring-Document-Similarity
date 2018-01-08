package ie.gmit.sw;


import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import javax.naming.spi.DirStateFactory.Result;

public class Block {
	
	private static BlockingQueue<Job> inQueue;
	private static BlockingQueue<List<Result>> outQueue;
	
	private Block()
	{
		
	}
	
	public static synchronized Boolean init()
	{
		
		inQueue = new ArrayBlockingQueue<Job>(100);
		outQueue = new ArrayBlockingQueue<List<Result>>(100);
		
		return true;
	}

	public static BlockingQueue<Job> getInQueue() {
		return inQueue;
	}

	public static void setInQueue(BlockingQueue<Job> inQueue) {
		Block.inQueue = inQueue;
	}

	public static BlockingQueue<List<Result>> getOutQueue() {
		return outQueue;
	}

	public static void setOutQueue(BlockingQueue<List<Result>> outQueue) {
		Block.outQueue = outQueue;
	}
	
	public static void addToInQueue(Job j)
	{
		Block.inQueue.add(j);
	}
	
	public static void addToOutQueue(List<Result> r)
	{
		Block.outQueue.add(r);
	}
	
}