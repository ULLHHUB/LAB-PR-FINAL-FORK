package es.edu.ull.esit;

import es.edu.ull.esit.algorithm.SearchAlgorithm;

/**
 * Context class for pathfinding algorithms using the Strategy pattern.
 * Supports DFS, BFS, A*, Dijkstra, Greedy Best-First Search, and Bidirectional Search.
 * Each algorithm is implemented as a separate strategy class.
 */
public class Algorithm {
	
	private int searchtime = 100;
	private SearchAlgorithm strategy;
	
	/**
	 * Sets the search algorithm strategy.
	 * 
	 * @param strategy The search algorithm to use
	 */
	public void setStrategy(SearchAlgorithm strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * Performs the search using the currently set strategy.
	 * 
	 * @param start The starting node
	 * @param end The target/end node
	 * @param graphWidth The width of the grid
	 * @param graphHeight The height of the grid
	 */
	public void performSearch(Node start, Node end, int graphWidth, int graphHeight) {
		if (strategy != null) {
			strategy.search(start, end, graphWidth, graphHeight, searchtime);
		}
	}
	
	/**
	 * Gets the current search time delay in milliseconds.
	 * 
	 * @return The search time in milliseconds
	 */
	public int getSearchTime() {
		return searchtime;
	}
	
	/**
	 * Sets the search time delay for visualization.
	 * Controls the speed of the search animation.
	 * 
	 * @param searchtime The search time in milliseconds
	 */
	public void setSearchTime(int searchtime) {
		this.searchtime = searchtime;
	}
}
