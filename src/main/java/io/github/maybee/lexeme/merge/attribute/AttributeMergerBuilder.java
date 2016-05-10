package io.github.maybee.lexeme.merge.attribute;

import io.github.maybee.lexeme.mergeschema.Attribute;

/**
 *
 * @author sholzer (Jul 7, 2015)
 */
public interface AttributeMergerBuilder {

    /**
     * Initializes a new AttributeMerger implementation.
     * @param attribute
     *            Attribute object containing the merge rules for a given attribute
     * @return AttributeMerger
     */
    public AttributeMerger build(Attribute attribute);
}
