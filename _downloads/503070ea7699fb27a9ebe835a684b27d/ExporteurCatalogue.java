package catalogue.io;

import java.io.IOException;
import catalogue.Catalogue;

public interface ExporteurCatalogue {

	void exporter(Catalogue catalogue) throws IOException;

}

