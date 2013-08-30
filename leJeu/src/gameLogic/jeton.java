/**
 * 
 */
package gameLogic;

/**
 * @author Philippe
 *
 */
public class jeton {

	int poids;
	int taille;
	
	public jeton() {
		this.poids=1;
		this.taille=1;
	}
	
	// TODO verifier que c'est bien un void, et pas le dessin lui-même
	public void explose (int frameNb);
	
	public void tombe (int frameNb);
	
}
