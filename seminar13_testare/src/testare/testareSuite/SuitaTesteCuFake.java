package testare.testareSuite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.teste.AgentieTurismTest;
import testare.teste.PachetTuristicTest;
import testare.teste.TesteCuFake;
import testare.teste.TestePentruBoundery;

@RunWith(Suite.class)
//@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(TesteCuFake.class)
@Categories.ExcludeCategory(TestePentruBoundery.class)
public class SuitaTesteCuFake {
}
