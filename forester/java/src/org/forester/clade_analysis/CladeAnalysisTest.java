
package org.forester.clade_analysis;

import java.io.File;

import org.forester.io.parsers.PhylogenyParser;
import org.forester.io.parsers.util.ParserUtils;
import org.forester.phylogeny.Phylogeny;
import org.forester.phylogeny.factories.ParserBasedPhylogenyFactory;
import org.forester.phylogeny.factories.PhylogenyFactory;
import org.forester.util.ForesterUtil;

public class CladeAnalysisTest {

    private final static String PATH_TO_TEST_DATA = System.getProperty( "user.dir" ) + ForesterUtil.getFileSeparator()
            + "test_data" + ForesterUtil.getFileSeparator();

    public static void main( final String[] args ) {
        boolean failed = false;
        if ( !testCladeAnalysis1() ) {
            System.out.println( "Clade analysis 1 failed" );
            failed = true;
        }
        if ( !testCladeAnalysis2() ) {
            System.out.println( "Clade analysis 2 failed" );
            failed = true;
        }
        if ( !failed ) {
            System.out.println( "OK" );
        }
    }

    public static boolean test() {
        if ( !testCladeAnalysis1() ) {
            return false;
        }
        if ( !testCladeAnalysis2() ) {
            return false;
        }
        return true;
    }

    private static boolean testCladeAnalysis1() {
        try {
            final File intreefile1 = new File( PATH_TO_TEST_DATA + "clade_analysis_test_1.xml" );
            final PhylogenyFactory factory = ParserBasedPhylogenyFactory.getInstance();
            final PhylogenyParser pp = ParserUtils.createParserDependingOnFileType( intreefile1, true );
            final Phylogeny p1 = factory.create( intreefile1, pp )[ 0 ];
            Result res = Analysis.execute( p1, "A.1.1.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A.1.2.1" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 4 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.1.1.2", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A.1.2.1" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 4 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.1.1.3", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A.1.2.1" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 4 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.1.1.4", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A.1.1" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 3 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.1.2.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 17 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.2.1.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.2.1.2" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 17 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.2.1.2", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.2.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 17 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.3.1.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A.3" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.3.1.2" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A.3.2.1" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 2 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.3.1.2", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A.3" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.3.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A.3.2.1" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 2 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.3.2.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A.3" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.3.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A.3.3.1" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 3 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.3.3.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.3" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 10 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.4.1.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A.4.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.4.1.1.a" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A.4.1.2" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 3 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.4.1.1.a", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A.4.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.4.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A.4.1.2" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 3 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.4.1.2", "." );
            res = Analysis.execute( p1, "A.4.1.2.a", "." );
            res = Analysis.execute( p1, "A.5.1.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.5.1.2" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 10 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.5.1.2", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A.5.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 10 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "A.6.3.12", "." );
            if ( !res.getGreatestCommonPrefix().equals( "A" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "A" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "A" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 17 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "B.1.1.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "B.1.234.3" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 25 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 2 ) {
                return false;
            }
            res = Analysis.execute( p1, "B.1.234.3", "." );
            if ( !res.getGreatestCommonPrefix().equals( "" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "B.1.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 25 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 2 ) {
                return false;
            }
            res = Analysis.execute( p1, "C.1.1.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "C.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "C.1.1.2" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "C.1.2.1" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 2 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "C.1.1.2", "." );
            if ( !res.getGreatestCommonPrefix().equals( "C.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "C.1.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "C.1.2.1" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 2 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "C.1.2.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "C" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "C.1.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "C.2.1" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 3 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "C.2.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "C" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "C.1" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "C.3" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 4 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "C.3", "." );
            if ( !res.getGreatestCommonPrefix().equals( "" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "C" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "QE.1.1.1.2.1" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 5 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 1 ) {
                return false;
            }
            res = Analysis.execute( p1, "QE.1.1.1.2.1", "." );
            if ( !res.getGreatestCommonPrefix().equals( "" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "C" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 25 ) {
                return false;
            }
            if ( res.getTreeSize() != 25 ) {
                return false;
            }
            if ( res.getWarnings().size() != 2 ) {
                return false;
            }
        }
        catch ( final Exception e ) {
            e.printStackTrace( System.out );
            return false;
        }
        return true;
    }

    private static boolean testCladeAnalysis2() {
        try {
            final File intreefile1 = new File( PATH_TO_TEST_DATA + "clade_analysis_test_2.xml" );
            final PhylogenyFactory factory = ParserBasedPhylogenyFactory.getInstance();
            final PhylogenyParser pp = ParserUtils.createParserDependingOnFileType( intreefile1, true );
            final Phylogeny p1 = factory.create( intreefile1, pp )[ 0 ];
            Result res = Analysis.execute( p1, "6_DQ278891", null );
            if ( !res.getGreatestCommonPrefix().equals( "6_" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "6_DQ278893" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "6_JX183550" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 2 ) {
                return false;
            }
            if ( res.getTreeSize() != 219 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "6xa_EU408330", null );
            if ( !res.getGreatestCommonPrefix().equals( "6xa_EU40833" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "6xa_EU408331" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "6xa_EU408332" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 2 ) {
                return false;
            }
            if ( res.getTreeSize() != 219 ) {
                return false;
            }
            if ( res.getWarnings().size() != 0 ) {
                return false;
            }
            res = Analysis.execute( p1, "7a_EF108306", null );
            if ( !res.getGreatestCommonPrefix().equals( "" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixDown().equals( "2" ) ) {
                return false;
            }
            if ( !res.getGreatestCommonPrefixUp().equals( "" ) ) {
                return false;
            }
            if ( res.getLeastEncompassingCladeSize() != 219 ) {
                return false;
            }
            if ( res.getTreeSize() != 219 ) {
                return false;
            }
            if ( res.getWarnings().size() != 2 ) {
                return false;
            }
        }
        catch ( final Exception e ) {
            e.printStackTrace( System.out );
            return false;
        }
        return true;
    }
}
