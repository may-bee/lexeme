package com.github.maybeec.lexeme.validator;

import com.github.maybeec.lexeme.schemaprovider.MergeSchemaProvider;

/**
 *
 * @author sholzer (Jul 7, 2015)
 */
public interface DocumentValidatorBuilder {

    /**
     * Builds a DocumentValidator implementation
     * @param provider
     *            MergeSchemaProvider
     * @return DocumentValidator
     * @author sholzer (Jul 7, 2015)
     */
    public DocumentValidator build(MergeSchemaProvider provider);

}
