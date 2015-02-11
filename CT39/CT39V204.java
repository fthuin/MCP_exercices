package main;
//Ce fichier est encodé en UTF8.

//Nom et prénom de l'étudiant 1
//Nom et prénom de l'étudiant 2
//Nom et prénom de l'étudiant 3
//Nom et prénom de l'étudiant 4

// Remplacez les deux caractères XX par votre numéro de groupe encodé sur deux chiffres!
public class CT39V2XX {
  
  // Le paramètre t n'est pas null. 
  // De plus, il représente un vecteur de n entiers relatifs.
  
  // Cette méthode ne modifie pas les éléments du tableau t.
  // Elle renvoie la somme de la sous-sequence maximum de t.
  public static long maxSum(int[] t) {
	  long sum = Integer.MIN_VALUE;
	  long sumCurr = 0;
	  
	  for (int i = 0; i < t.length ; i++) {
		 
		  
		  if(sumCurr <= 0){
			  sumCurr = t[i];
		  }else{
		  
		  sumCurr += t[i];}
		  
		  if (sum < sumCurr ) {
			  sum = sumCurr;
		  }
	  }
	  
	  if(sum <= 0) {
		  return 0;
	  }
	  
	  return sum;
  }
  
  //***********************************************************************************
  //Expliquez comment vous avez développé ce programme
  
  //***********************************************************************************
  //Expliquez pourquoi vous pensez que votre méthode est correcte
}