package com.epages.sonar.perl.rules;

public class PerlCritic {

    private PerlCritic() {
        throw new UnsupportedOperationException("Do not instanciate.");
    }

    public static final String PERLCRITIC_REPORT_PATH_KEY = "sonar.perlcritic.reportPath";

    public static final String PERLCRITIC_REPORT_PATH_DEFAULT = "perlcritic_report.txt";

}
