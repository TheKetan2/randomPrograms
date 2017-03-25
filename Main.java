/* 	Program to tell meaning of name.
	Ketan D. Ramteke
	25/03/2017
	
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// you can add any words or sentence in following string arrays
		
		String[] A = {"Amazing","Actor","Awesome"};
		String[] B = {"Beautiful","Bubbly","Beast"};
		String[] C = {"Crazy","Cool","Charismatic"};
		String[] D = {"Dashing","Dangerous","Dude"};
		String[] E = {"Enegetic","Electric","Elegant"};
		String[] F = {"Fast","Fantastic","Funny"};
		String[] G = {"Great","Giant","Good"};
		String[] H = {"Happy","Hillarious","Hip"};
		String[] I = {"Intelligent","Important","Indian"};
		String[] J = {"Juliet","Jelly","Jolly"};
		String[] K = {"King","Killer","Kid"};
		String[] L = {"Lazy","Lucky","Lovable"};
		String[] M = {"Majestic","Magical","Musical"};
		String[] N = {"Nuclear","Nasty","Noob"};
		String[] O = {"Observer","Optimist","Omega"};
		String[] P = {"Popular","Pure","Pessimist"};
		String[] Q = {"Queen","Quite","Quality Person"};
		String[] R = {"Rustam","Rockstar","Relaxed"};
		String[] S = {"Super","Sexy","Shy"};
		String[] T = {"Tomboy","Topshot","Trained"};
		String[] U = {"Ultimate","Unique","Ultra Powerful"};
		String[] V = {"Vivid","Vast","Viking"};
		String[] W = {"Workoholic","Winner","Wicked"};
		String[] X = {"Exciting","Exotic","Xenomorph"};
		String[] Y = {"Young at Heart","Yaws always","Be yourself"};
		String[] Z = {"Zapping","Has Zeel to win","Zopalu Prani"};
		
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toUpperCase().toCharArray();
		Random rand = new Random();
		for(char ch:arr){
			switch(ch){
				case 'A':
					System.out.println(ch+" : "+A[rand.nextInt(A.length)]);
					break;
				case 'B':
					System.out.println(ch+" : "+B[rand.nextInt(B.length)]);
					break;
				case 'C':
					System.out.println(ch+" : "+C[rand.nextInt(C.length)]);
					break;
				case 'D':
					System.out.println(ch+" : "+D[rand.nextInt(D.length)]);
					break;
				case 'E':
					System.out.println(ch+" : "+E[rand.nextInt(E.length)]);
					break;
				case 'F':
					System.out.println(ch+" : "+F[rand.nextInt(F.length)]);
					break;
				case 'G':
					System.out.println(ch+" : "+G[rand.nextInt(G.length)]);
					break;
				case 'H':
					System.out.println(ch+" : "+H[rand.nextInt(H.length)]);
					break;
				case 'I':
					System.out.println(ch+" : "+I[rand.nextInt(I.length)]);
					break;
				case 'J':
					System.out.println(ch+" : "+J[rand.nextInt(J.length)]);
					break;
				case 'K':
					System.out.println(ch+" : "+K[rand.nextInt(K.length)]);
					break;
				case 'L':
					System.out.println(ch+" : "+L[rand.nextInt(L.length)]);
					break;
				case 'M':
					System.out.println(ch+" : "+M[rand.nextInt(N.length)]);
					break;
				case 'N':
					System.out.println(ch+" : "+N[rand.nextInt(M.length)]);
					break;
				case 'O':
					System.out.println(ch+" : "+O[rand.nextInt(O.length)]);
					break;
				case 'P':
					System.out.println(ch+" : "+P[rand.nextInt(P.length)]);
					break;
				case 'Q':
					System.out.println(ch+" : "+Q[rand.nextInt(Q.length)]);
					break;
				case 'R':
					System.out.println(ch+" : "+R[rand.nextInt(R.length)]);
					break;
				case 'S':
					System.out.println(ch+" : "+S[rand.nextInt(S.length)]);
					break;
				case 'T':
					System.out.println(ch+" : "+T[rand.nextInt(T.length)]);
					break;
				case 'U':
					System.out.println(ch+" : "+U[rand.nextInt(U.length)]);
					break;
				case 'V':
					System.out.println(ch+" : "+V[rand.nextInt(V.length)]);
					break;
				case 'W':
					System.out.println(ch+" : "+W[rand.nextInt(W.length)]);
					break;
				case 'X':
					System.out.println(ch+" : "+X[rand.nextInt(X.length)]);
					break;
				case 'Y':
					System.out.println(ch+" : "+Y[rand.nextInt(Y.length)]);
					break;
				case 'Z':
					System.out.println(ch+" : "+Z[rand.nextInt(Z.length)]);
					break;
				default:
					break;
			}
		}
	}	
}