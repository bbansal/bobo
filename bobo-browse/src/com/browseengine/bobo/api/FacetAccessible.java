package com.browseengine.bobo.api;

import java.util.Iterator;
import java.util.List;

public interface FacetAccessible 
{
	/**
	 * Gets gathered top facets
	 * @return list of facets
	 */
	List<BrowseFacet> getFacets();
	
	/**
	 * Gets the facet given a value. This is a way for random accessing into the facet data structure.
	 * @param value Facet value
	 * @return a facet with count filled in
	 */
	BrowseFacet getFacet(String value);
  
	public void close();
	
	/**
	 * Visits the list of facets within this FacetAccessible 
	 * @param visitor	the FacetVisitor used to process the list of facets
	 */
	void visitFacets(FacetVisitor visitor);
	
	/**
	 * Returns an iterator to visit all the facets
	 * @return	Returns a FacetIterator to iterate over all the facets
	 */
	Iterator iterator();
}