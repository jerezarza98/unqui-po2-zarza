package unq.templateMethod.wikipediaPage;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.templateMethod.wikipediaPage.MismaLetraInicial;
import ar.edu.unq.poo2.templateMethod.wikipediaPage.WikipediaPage;

class MismaLetraInicialTest {
	
	private MismaLetraInicial filtro;
	private WikipediaPage wiki, wiki2;
	private List<WikipediaPage> wikiList;
	
	@BeforeEach
	public void setUp() {
		filtro = new MismaLetraInicial();
		wiki = mock(WikipediaPage.class);
		wiki2 = mock(WikipediaPage.class);
		wikiList = new ArrayList<WikipediaPage>();
		
		when(wiki.getTitle()).thenReturn("La Plata");
		
		wikiList.add(wiki2);
	}

	@Test
	void testNoTieneNingunaWikipediaPageSimilar() {
		when(wiki2.getTitle()).thenReturn("Otra cosa");
		
		
		
		assertTrue(filtro.getSimilarPages(wiki, wikiList).isEmpty());
		
	}
	
	@Test
	void testTieneUnaWikiPediaPageSimilar() {
		when(wiki2.getTitle()).thenReturn("Lobo");
		
		assertFalse(filtro.getSimilarPages(wiki, wikiList).isEmpty());
		assertTrue(filtro.getSimilarPages(wiki, wikiList).contains(wiki2));
	}

}
