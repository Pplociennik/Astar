package com.pathfinding;


//definition of a grid's cell
public class Cell {

    //coordinates
    public int i, j;
    //parent cell for path
    public Cell parent;
    //heuristic cost of the current cell
    public int heuristicCost;
    //final cost
    public int finalCost; /* G + H with
    G(n) the cost of the path from the start node to n
    and H(n) the heuristic that estimates the cost of the cheapest path from n to the goal */

    public boolean solution; // if cell is part of the solution path

    public Cell(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "[ " + i + ", " + j + " ]";
    }
}
