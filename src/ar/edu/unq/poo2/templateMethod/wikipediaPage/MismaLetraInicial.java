package ar.edu.unq.poo2.templateMethod.wikipediaPage;

import java.util.ArrayList;
import java.util.List;

public class MismaLetraInicial {

	public List<WikipediaPage> getSimilarPages(WikipediaPage wiki, List<WikipediaPage> wikiList) {
		
		List<WikipediaPage> pages = new ArrayList<WikipediaPage>();
		
		for(WikipediaPage page : wikiList) {
			if(this.sonSimilares(wiki, page)) {
				pages.add(page);
			}
		}
		
		return pages;
	}
	
	public boolean sonSimilares(WikipediaPage page, WikipediaPage page2) {
		return page.getTitle().startsWith(page2.getTitle().substring(0, 1));
	}

}
