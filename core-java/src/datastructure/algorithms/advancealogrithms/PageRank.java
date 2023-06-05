package datastructure.algorithms.advancealogrithms;
import java.util.Arrays;

public class PageRank {

    /*PageRank Algorithm: 
    The PageRank algorithm is used by search engines 
    to rank web pages based on their importance and relevance. 
    It played a crucial role in the development of Google's search engine. */
    
    private static final double DAMPING_FACTOR = 0.85;
    private static final double EPSILON = 0.0001;

    public static void main(String[] args) {
        int numPages = 4; // Number of pages in the web graph
        double[][] adjacencyMatrix = {
            {0, 0, 1, 0}, // Page 1 links to Page 3
            {1, 0, 0, 0}, // Page 2 links to Page 1
            {1, 1, 0, 1}, // Page 3 links to Pages 1, 2, 4
            {0, 1, 0, 0}  // Page 4 links to Page 2
        };

        double[] pageRanks = calculatePageRanks(adjacencyMatrix, numPages);

        System.out.println("Page Ranks:");
        for (int i = 0; i < numPages; i++) {
            System.out.println("Page " + (i + 1) + ": " + pageRanks[i]);
        }
    }

    private static double[] calculatePageRanks(double[][] adjacencyMatrix, int numPages) {
        double[] pageRanks = new double[numPages];
        Arrays.fill(pageRanks, 1.0 / numPages); // Initialize with equal page ranks

        boolean converged = false;

        while (!converged) {
            double[] newPageRanks = new double[numPages];
            double sum = 0.0;

            for (int i = 0; i < numPages; i++) {
                for (int j = 0; j < numPages; j++) {
                    if (adjacencyMatrix[j][i] == 1) {
                        sum += pageRanks[j] / countOutgoingLinks(adjacencyMatrix, j);
                    }
                }

                newPageRanks[i] = (1 - DAMPING_FACTOR) / numPages + DAMPING_FACTOR * sum;
                sum = 0.0;
            }

            converged = hasConverged(pageRanks, newPageRanks);
            pageRanks = newPageRanks;
        }

        return pageRanks;
    }

    private static int countOutgoingLinks(double[][] adjacencyMatrix, int page) {
        int count = 0;

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[page][i] == 1) {
                count++;
            }
        }

        return count;
    }

    private static boolean hasConverged(double[] oldPageRanks, double[] newPageRanks) {
        for (int i = 0; i < oldPageRanks.length; i++) {
            if (Math.abs(oldPageRanks[i] - newPageRanks[i]) > EPSILON) {
                return false;
            }
        }

        return true;
    }


}

