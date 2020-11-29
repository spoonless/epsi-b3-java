package catalogue.io;

import java.io.IOException;
import catalogue.Catalogue;

public interface ImporteurCatalogue {

	Catalogue importer() throws IOException;

}

