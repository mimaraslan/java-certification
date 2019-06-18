package _0025_implementing_interfaces;

// private, protected, or final will trigger a compiler error
interface WalksOnFourLegs {}
interface HasTrunk {}
interface Herbivore {}

public class Elephant implements WalksOnFourLegs, HasTrunk, Herbivore {}