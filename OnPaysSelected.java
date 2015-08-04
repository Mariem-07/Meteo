package com.example.tutometeo;

/**
 * Cette interface permet de faire appel à des méthodes écrites au niveau de
 * la classe de l'activité. Pour le faire nous devons écrire les signatures
 * des méthodes auxquelles nous souhaiterons faire appel à partir de ce
 * fragment. Dans notre cas, nous souhaiterons faire appel à la méthode
 * paysSelect(String name) qui se chargera de démarrer une activité si
 * l'application tourne sur un smartphone ou de mettre à jour un fragment
 * existant à l'écran dans le cas d'une tablette.
 */
public interface OnPaysSelected {
	/**
	 * @param name
	 *            Nom du pays sélectionné sur la liste.
	 */
	public void paysSelect(String name);
}
