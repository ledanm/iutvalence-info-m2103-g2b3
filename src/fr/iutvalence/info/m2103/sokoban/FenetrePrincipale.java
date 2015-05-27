package fr.iutvalence.info.m2103.sokoban;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;





/**
 * IHM de la fenêtre principale
 * @author litzenbr
 *
 */
public class FenetrePrincipale 
{
	/**
	 * fenêtre contenant l'écran de jeu
	 */
	private JFrame fenetre;
	private JMenuItem MenuItemJouer;
	private JMenuItem MenuItemFermer;
	
	/**
	 * méthode pour intialiser l'IHM
	 */
	private void initialisationInterfaceGraphique()
	{
		this.fenetre= new JFrame();
		
	}
	
	public void BarreDeMenu(JFrame fenetre)
	{
		this.fenetre = fenetre;
		JMenu menu = new JMenu("Menu");
		this.MenuItemJouer = new JMenuItem("Jouer");
		this.MenuItemFermer = new JMenuItem("Fermer");
		menu.add(this.MenuItemJouer);
		menu.add(this.MenuItemFermer);
		
		
	}
}
