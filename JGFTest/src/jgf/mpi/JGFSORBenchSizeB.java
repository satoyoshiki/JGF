package jgf.mpi;

/**************************************************************************
*                                                                         *
*             Java Grande Forum Benchmark Suite - MPJ Version 1.0         *
*                                                                         *
*                            produced by                                  *
*                                                                         *
*                  Java Grande Benchmarking Project                       *
*                                                                         *
*                                at                                       *
*                                                                         *
*                Edinburgh Parallel Computing Centre                      *
*                                                                         * 
*                email: epcc-javagrande@epcc.ed.ac.uk                     *
*                                                                         *
*                                                                         *
*      This version copyright (c) The University of Edinburgh, 2001.      *
*                         All rights reserved.                            *
*                                                                         *
**************************************************************************/


import jgf.mpi.util.JGFInstrumentor;
import jgf.mpi.sor.JGFSORBench; 
import jgf.mpi.util.*; 
import mpi.*;

public class JGFSORBenchSizeB{ 

  public static int nprocess;
  public static int rank;

  public static void main(String argv[]) throws MPIException{

/* Initialise MPI */
    MPI.Init(argv);
    rank = MPI.COMM_WORLD.Rank();
    nprocess = MPI.COMM_WORLD.Size();

    if(rank==0) {
      JGFInstrumentor.printHeader(2,1,nprocess);
    }

    JGFSORBench sor = new JGFSORBench(nprocess,rank); 
    sor.JGFrun(1);

/* Finalise MPI */
     MPI.Finalize();
 
  }
}


