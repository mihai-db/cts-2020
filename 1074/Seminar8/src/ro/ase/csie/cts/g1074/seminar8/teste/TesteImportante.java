package ro.ase.csie.cts.g1074.seminar8.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({TestClient.class, TestNimic.class})
@IncludeCategory(CategorieImportante.class)
public class TesteImportante {

}
