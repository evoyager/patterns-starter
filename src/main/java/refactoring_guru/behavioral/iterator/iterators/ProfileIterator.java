package refactoring_guru.behavioral.iterator.iterators;

import refactoring_guru.behavioral.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
