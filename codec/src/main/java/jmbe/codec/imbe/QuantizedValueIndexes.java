/*
 * ******************************************************************************
 * Copyright (C) 2015-2019 Dennis Sheirer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * *****************************************************************************
 */

package jmbe.codec.imbe;

import java.util.Map;
import java.util.TreeMap;

/**
 * Transmitted message indexes for each of the b(3) through b(L + 1) residual values stored in indexes starting at 0.
 */
public enum QuantizedValueIndexes
{
    L09(9, new int[][]{{9, 10, 27, 34, 53, 72, 80, 108, 116, 128}, {11, 28, 46, 54, 73, 97, 109, 117, 129}, {23, 29, 47, 55, 74, 98, 110, 122, 130}, {24, 30, 48, 56, 75, 99, 111, 123, 131}, {25, 31, 49, 57, 76, 100, 112, 124, 132}, {26, 32, 50, 69, 77, 101, 113, 125, 137}, {33, 51, 70, 78, 102, 114, 126, 138}, {52, 71, 79, 107, 115, 127, 139}}),
    L10(10, new int[][]{{9, 23, 29, 47, 55, 75, 101, 114, 127}, {10, 24, 30, 48, 56, 76, 102, 115, 128}, {25, 31, 49, 57, 77, 107, 116, 129}, {26, 32, 50, 69, 78, 108, 117, 130}, {27, 33, 51, 70, 79, 109, 122, 131}, {11, 28, 34, 52, 71, 80, 110, 123, 132}, {46, 53, 72, 98, 111, 124, 137}, {54, 73, 99, 112, 125, 138}, {74, 100, 113, 126, 139}}),
    L11(11, new int[][]{{10, 25, 32, 51, 71, 98, 112, 126}, {11, 26, 33, 52, 72, 99, 113, 127}, {23, 27, 34, 53, 73, 100, 114, 128}, {28, 46, 54, 74, 101, 115, 129}, {29, 47, 55, 75, 102, 116, 130}, {9, 24, 30, 48, 56, 76, 107, 117, 131}, {31, 49, 57, 77, 108, 122, 132}, {50, 69, 78, 109, 123, 137}, {70, 79, 110, 124, 138}, {80, 111, 125, 139}}),
    L12(12, new int[][]{{9, 11, 29, 48, 57, 78, 110, 125}, {23, 30, 49, 69, 79, 111, 126}, {24, 31, 50, 70, 80, 112, 127}, {25, 32, 51, 71, 98, 113, 128}, {26, 33, 52, 72, 99, 114, 129}, {10, 27, 34, 53, 73, 100, 115, 130}, {28, 46, 54, 74, 101, 116, 131}, {47, 55, 75, 102, 117, 132}, {56, 76, 107, 122, 137}, {77, 108, 123, 138}, {109, 124, 139}}),
    L13(13, new int[][]{{9, 25, 33, 53, 74, 108, 124}, {10, 26, 34, 54, 75, 109, 125}, {11, 27, 46, 55, 76, 110, 126}, {28, 47, 56, 77, 111, 127}, {29, 48, 57, 78, 112, 128}, {23, 30, 49, 69, 79, 113, 129}, {24, 31, 50, 70, 80, 114, 130}, {32, 51, 71, 99, 115, 131}, {52, 72, 100, 116, 132}, {73, 101, 117, 137}, {102, 122, 138}, {107, 123, 139}}),
    L14(14, new int[][]{{9, 23, 30, 49, 71, 102, 123}, {24, 31, 50, 72, 107, 124}, {25, 32, 51, 73, 108, 125}, {26, 33, 52, 74, 109, 126}, {27, 34, 53, 75, 110, 127}, {10, 28, 46, 54, 76, 111, 128}, {11, 29, 47, 55, 77, 112, 129}, {48, 56, 78, 113, 130}, {57, 79, 114, 131}, {69, 80, 115, 132}, {99, 116, 137}, {70, 100, 117, 138}, {101, 122, 139}}),
    L15(15, new int[][]{{9, 11, 28, 47, 57, 100, 122}, {23, 29, 48, 69, 101, 123}, {24, 30, 49, 70, 102, 124}, {25, 31, 50, 71, 107, 125}, {32, 51, 72, 108, 126}, {26, 33, 52, 73, 109, 127}, {10, 27, 34, 53, 74, 110, 128}, {46, 54, 75, 111, 129}, {55, 76, 112, 130}, {56, 77, 113, 131}, {78, 114, 132}, {79, 115, 137}, {80, 116, 138}, {99, 117, 139}}),
    L16(16, new int[][]{{9, 25, 33, 54, 79, 117}, {10, 26, 34, 55, 80, 122}, {11, 27, 46, 56, 100, 123}, {28, 47, 57, 101, 124}, {29, 48, 69, 102, 125}, {23, 30, 49, 70, 107, 126}, {24, 31, 50, 71, 108, 127}, {32, 51, 72, 109, 128}, {52, 73, 110, 129}, {53, 74, 111, 130}, {75, 112, 131}, {76, 113, 132}, {77, 114, 137}, {78, 115, 138}, {116, 139}}),
    L17(17, new int[][]{{9, 11, 30, 52, 77, 116}, {10, 23, 31, 53, 78, 117}, {24, 32, 54, 79, 122}, {25, 33, 55, 80, 123}, {26, 34, 56, 100, 124}, {27, 46, 57, 101, 125}, {28, 47, 69, 102, 126}, {29, 48, 70, 107, 127}, {49, 71, 108, 128}, {50, 72, 109, 129}, {51, 73, 110, 130}, {74, 111, 131}, {75, 112, 132}, {113, 137}, {76, 114, 138}, {115, 139}}),
    L18(18, new int[][]{{9, 10, 29, 50, 75, 115}, {11, 30, 51, 76, 116}, {23, 31, 52, 77, 117}, {24, 32, 53, 78, 122}, {25, 33, 54, 79, 123}, {26, 34, 55, 80, 124}, {46, 56, 100, 125}, {27, 47, 57, 101, 126}, {28, 48, 69, 102, 127}, {49, 70, 107, 128}, {71, 108, 129}, {72, 109, 130}, {73, 110, 131}, {74, 111, 132}, {112, 137}, {113, 138}, {114, 139}}),
    L19(19, new int[][]{{9, 10, 26, 47, 73, 114}, {11, 27, 48, 74, 115}, {23, 28, 49, 75, 116}, {29, 50, 76, 117}, {30, 51, 77, 122}, {24, 31, 52, 78, 123}, {32, 53, 79, 124}, {25, 33, 54, 80, 125}, {34, 55, 101, 126}, {46, 56, 102, 127}, {57, 107, 128}, {69, 108, 129}, {70, 109, 130}, {71, 110, 131}, {111, 132}, {72, 112, 137}, {113, 138}, {139}}),
    L20(20, new int[][]{{9, 10, 26, 47, 72, 113}, {11, 27, 48, 73, 114}, {23, 28, 49, 74, 115}, {29, 50, 75, 116}, {30, 51, 76, 117}, {24, 31, 52, 77, 122}, {32, 53, 78, 123}, {25, 33, 54, 79, 124}, {34, 55, 80, 125}, {46, 56, 101, 126}, {57, 102, 127}, {69, 107, 128}, {108, 129}, {70, 109, 130}, {110, 131}, {132}, {71, 111, 137}, {112, 138}, {139}}),
    L21(21, new int[][]{{9, 24, 34, 70, 112}, {10, 25, 46, 71, 113}, {11, 26, 47, 72, 114}, {27, 48, 73, 115}, {28, 49, 74, 116}, {29, 50, 75, 117}, {30, 51, 76, 122}, {23, 31, 52, 77, 123}, {32, 53, 78, 124}, {33, 54, 79, 125}, {55, 80, 126}, {56, 101, 127}, {102, 128}, {107, 129}, {57, 108, 130}, {109, 131}, {132}, {69, 110, 137}, {111, 138}, {139}}),
    L22(22, new int[][]{{9, 11, 32, 56, 111}, {10, 23, 33, 57, 112}, {24, 34, 69, 113}, {25, 46, 70, 114}, {26, 47, 71, 115}, {27, 48, 72, 116}, {28, 49, 73, 117}, {29, 50, 74, 122}, {30, 51, 75, 123}, {31, 52, 76, 124}, {53, 77, 125}, {78, 126}, {54, 79, 127}, {80, 128}, {102, 129}, {55, 107, 130}, {108, 131}, {132}, {109, 137}, {110, 138}, {139}}),
    L23(23, new int[][]{{9, 10, 30, 54, 110}, {11, 31, 55, 111}, {23, 32, 56, 112}, {24, 33, 57, 113}, {25, 34, 69, 114}, {26, 46, 70, 115}, {47, 71, 116}, {27, 48, 72, 117}, {28, 49, 73, 122}, {50, 74, 123}, {29, 51, 75, 124}, {52, 76, 125}, {77, 126}, {53, 78, 127}, {79, 128}, {80, 129}, {102, 130}, {107, 131}, {132}, {108, 137}, {109, 138}, {139}}),
    L24(24, new int[][]{{9, 10, 28, 53, 109}, {11, 29, 54, 110}, {23, 30, 55, 111}, {24, 31, 56, 112}, {25, 32, 57, 113}, {26, 33, 69, 114}, {34, 70, 115}, {46, 71, 116}, {27, 47, 72, 117}, {48, 73, 122}, {49, 74, 123}, {50, 75, 124}, {51, 76, 125}, {77, 126}, {52, 78, 127}, {79, 128}, {129}, {80, 130}, {102, 131}, {132}, {107, 137}, {108, 138}, {139}}),
    L25(25, new int[][]{{9, 10, 27, 52, 108}, {11, 28, 53, 109}, {23, 29, 54, 110}, {24, 30, 55, 111}, {31, 56, 112}, {25, 32, 57, 113}, {33, 69, 114}, {34, 70, 115}, {26, 46, 71, 116}, {47, 72, 117}, {48, 73, 122}, {49, 74, 123}, {50, 75, 124}, {76, 125}, {51, 77, 126}, {78, 127}, {128}, {79, 129}, {80, 130}, {131}, {107, 132}, {137}, {138}, {139}}),
    L26(26, new int[][]{{9, 10, 26, 50, 107}, {11, 27, 51, 108}, {23, 28, 52, 109}, {29, 53, 110}, {30, 54, 111}, {24, 31, 55, 112}, {32, 56, 113}, {33, 57, 114}, {25, 34, 69, 115}, {46, 70, 116}, {47, 71, 117}, {48, 72, 122}, {73, 123}, {74, 124}, {49, 75, 125}, {76, 126}, {127}, {77, 128}, {78, 129}, {130}, {131}, {79, 132}, {80, 137}, {138}, {139}}),
    L27(27, new int[][]{{9, 10, 26, 48, 80}, {11, 27, 49, 107}, {23, 28, 50, 108}, {29, 51, 109}, {30, 52, 110}, {24, 31, 53, 111}, {32, 54, 112}, {55, 113}, {25, 33, 56, 114}, {34, 57, 115}, {69, 116}, {46, 70, 117}, {71, 122}, {72, 123}, {47, 73, 124}, {74, 125}, {75, 126}, {127}, {76, 128}, {77, 129}, {130}, {131}, {78, 132}, {79, 137}, {138}, {139}}),
    L28(28, new int[][]{{9, 25, 47, 78}, {10, 26, 48, 79}, {11, 27, 49, 80}, {28, 50, 108}, {29, 51, 109}, {23, 30, 52, 110}, {31, 53, 111}, {54, 112}, {24, 32, 55, 113}, {33, 56, 114}, {57, 115}, {34, 69, 116}, {70, 117}, {71, 122}, {72, 123}, {46, 73, 124}, {74, 125}, {126}, {127}, {75, 128}, {76, 129}, {130}, {131}, {77, 132}, {137}, {138}, {139}}),
    L29(29, new int[][]{{9, 24, 46, 77}, {10, 25, 47, 78}, {11, 26, 48, 79}, {27, 49, 80}, {28, 50, 108}, {29, 51, 109}, {30, 52, 110}, {53, 111}, {23, 31, 54, 112}, {32, 55, 113}, {56, 114}, {57, 115}, {33, 69, 116}, {70, 117}, {71, 122}, {72, 123}, {34, 73, 124}, {74, 125}, {126}, {127}, {75, 128}, {129}, {130}, {131}, {76, 132}, {137}, {138}, {139}}),
    L30(30, new int[][]{{9, 23, 34, 76}, {10, 24, 46, 77}, {11, 25, 47, 78}, {26, 48, 79}, {27, 49, 80}, {28, 50, 108}, {29, 51, 109}, {52, 110}, {53, 111}, {30, 54, 112}, {31, 55, 113}, {56, 114}, {57, 115}, {32, 69, 116}, {70, 117}, {71, 122}, {123}, {33, 72, 124}, {73, 125}, {126}, {127}, {74, 128}, {129}, {130}, {131}, {75, 132}, {137}, {138}, {139}}),
    L31(31, new int[][]{{9, 11, 32, 74}, {10, 23, 33, 75}, {24, 34, 76}, {25, 46, 77}, {26, 47, 78}, {27, 48, 79}, {28, 49, 80}, {50, 109}, {51, 110}, {29, 52, 111}, {30, 53, 112}, {54, 113}, {55, 114}, {31, 56, 115}, {57, 116}, {69, 117}, {122}, {70, 123}, {71, 124}, {125}, {126}, {72, 127}, {128}, {129}, {130}, {73, 131}, {132}, {137}, {138}, {139}}),
    L32(32, new int[][]{{9, 11, 32, 74}, {10, 23, 33, 75}, {24, 34, 76}, {25, 46, 77}, {26, 47, 78}, {27, 48, 79}, {28, 49, 80}, {50, 109}, {51, 110}, {29, 52, 111}, {30, 53, 112}, {54, 113}, {55, 114}, {31, 56, 115}, {57, 116}, {69, 117}, {122}, {70, 123}, {71, 124}, {125}, {126}, {72, 127}, {128}, {129}, {130}, {131}, {73, 132}, {137}, {138}, {139}, {}}),
    L33(33, new int[][]{{9, 10, 31, 72}, {11, 32, 73}, {23, 33, 74}, {24, 34, 75}, {25, 46, 76}, {26, 47, 77}, {27, 48, 78}, {49, 79}, {50, 80}, {28, 51, 109}, {29, 52, 110}, {53, 111}, {54, 112}, {30, 55, 113}, {56, 114}, {115}, {116}, {57, 117}, {69, 122}, {123}, {124}, {125}, {70, 126}, {127}, {128}, {129}, {130}, {71, 131}, {132}, {137}, {138}, {139}}),
    L34(34, new int[][]{{9, 10, 29, 71}, {11, 30, 72}, {23, 31, 73}, {24, 32, 74}, {25, 33, 75}, {26, 34, 76}, {46, 77}, {47, 78}, {48, 79}, {27, 49, 80}, {50, 110}, {51, 111}, {52, 112}, {28, 53, 113}, {54, 114}, {55, 115}, {116}, {117}, {56, 122}, {57, 123}, {124}, {125}, {126}, {69, 127}, {128}, {129}, {130}, {131}, {70, 132}, {137}, {138}, {139}, {}}),
    L35(35, new int[][]{{9, 10, 29, 71}, {11, 30, 72}, {23, 31, 73}, {24, 32, 74}, {25, 33, 75}, {26, 34, 76}, {46, 77}, {47, 78}, {48, 79}, {27, 49, 80}, {50, 110}, {51, 111}, {52, 112}, {53, 113}, {28, 54, 114}, {55, 115}, {116}, {117}, {122}, {56, 123}, {57, 124}, {125}, {126}, {127}, {69, 128}, {129}, {130}, {131}, {}, {70, 132}, {137}, {138}, {139}, {}}),
    L36(36, new int[][]{{9, 10, 29, 70}, {11, 30, 71}, {23, 31, 72}, {24, 32, 73}, {25, 33, 74}, {26, 34, 75}, {46, 76}, {47, 77}, {48, 78}, {79}, {27, 49, 80}, {50, 110}, {51, 111}, {52, 112}, {113}, {28, 53, 114}, {54, 115}, {116}, {117}, {122}, {55, 123}, {56, 124}, {125}, {126}, {127}, {57, 128}, {129}, {130}, {131}, {}, {69, 132}, {137}, {138}, {139}, {}}),
    L37(37, new int[][]{{9, 10, 28, 69}, {11, 29, 70}, {23, 30, 71}, {24, 31, 72}, {32, 73}, {25, 33, 74}, {34, 75}, {46, 76}, {47, 77}, {78}, {26, 48, 79}, {49, 80}, {50, 110}, {51, 111}, {52, 112}, {27, 53, 113}, {54, 114}, {115}, {116}, {117}, {55, 122}, {123}, {124}, {125}, {126}, {56, 127}, {128}, {129}, {130}, {}, {57, 131}, {132}, {137}, {138}, {139}, {}}),
    L38(38, new int[][]{{9, 10, 28, 57}, {11, 29, 69}, {23, 30, 70}, {24, 31, 71}, {32, 72}, {25, 33, 73}, {34, 74}, {46, 75}, {47, 76}, {77}, {26, 48, 78}, {49, 79}, {50, 80}, {51, 110}, {111}, {27, 52, 112}, {53, 113}, {114}, {115}, {116}, {54, 117}, {122}, {123}, {124}, {125}, {55, 126}, {127}, {128}, {129}, {130}, {}, {56, 131}, {132}, {137}, {138}, {139}, {}}),
    L39(39, new int[][]{{9, 10, 28, 69}, {11, 29, 70}, {23, 30, 71}, {24, 31, 72}, {32, 73}, {25, 33, 74}, {34, 75}, {46, 76}, {47, 77}, {78}, {26, 48, 79}, {49, 80}, {50, 110}, {51, 111}, {112}, {27, 52, 113}, {53, 114}, {115}, {116}, {117}, {54, 122}, {55, 123}, {124}, {125}, {126}, {}, {56, 127}, {128}, {129}, {130}, {131}, {}, {57, 132}, {137}, {138}, {139}, {}, {}}),
    L40(40, new int[][]{{9, 10, 28, 57}, {11, 29, 69}, {23, 30, 70}, {24, 31, 71}, {32, 72}, {25, 33, 73}, {34, 74}, {46, 75}, {47, 76}, {77}, {26, 48, 78}, {49, 79}, {50, 80}, {110}, {111}, {27, 51, 112}, {52, 113}, {114}, {115}, {116}, {117}, {53, 122}, {54, 123}, {124}, {125}, {126}, {}, {55, 127}, {128}, {129}, {130}, {131}, {}, {56, 132}, {137}, {138}, {139}, {}, {}}),
    L41(41, new int[][]{{9, 10, 27, 56}, {11, 28, 57}, {23, 29, 69}, {30, 70}, {31, 71}, {24, 32, 72}, {33, 73}, {34, 74}, {75}, {76}, {25, 46, 77}, {47, 78}, {48, 79}, {49, 80}, {110}, {111}, {26, 50, 112}, {51, 113}, {114}, {115}, {116}, {117}, {52, 122}, {53, 123}, {124}, {125}, {126}, {}, {54, 127}, {128}, {129}, {130}, {131}, {}, {55, 132}, {137}, {138}, {139}, {}, {}}),
    L42(42, new int[][]{{9, 10, 26, 56}, {11, 27, 57}, {23, 28, 69}, {29, 70}, {30, 71}, {24, 31, 72}, {32, 73}, {33, 74}, {34, 75}, {76}, {77}, {25, 46, 78}, {47, 79}, {48, 80}, {49, 110}, {111}, {112}, {50, 113}, {51, 114}, {115}, {116}, {117}, {122}, {52, 123}, {53, 124}, {125}, {126}, {127}, {}, {54, 128}, {129}, {130}, {131}, {}, {}, {55, 132}, {137}, {138}, {139}, {}, {}}),
    L43(43, new int[][]{{9, 10, 26, 55}, {11, 27, 56}, {23, 28, 57}, {29, 69}, {30, 70}, {24, 31, 71}, {32, 72}, {33, 73}, {34, 74}, {75}, {76}, {25, 46, 77}, {47, 78}, {48, 79}, {49, 80}, {110}, {111}, {50, 112}, {51, 113}, {114}, {115}, {116}, {117}, {52, 122}, {123}, {124}, {125}, {126}, {}, {53, 127}, {128}, {129}, {130}, {}, {}, {54, 131}, {132}, {137}, {138}, {139}, {}, {}}),
    L44(44, new int[][]{{9, 10, 26, 54}, {11, 27, 55}, {23, 28, 56}, {29, 57}, {30, 69}, {24, 31, 70}, {32, 71}, {33, 72}, {73}, {74}, {75}, {25, 34, 76}, {46, 77}, {47, 78}, {48, 79}, {80}, {110}, {49, 111}, {50, 112}, {113}, {114}, {115}, {116}, {51, 117}, {122}, {123}, {124}, {125}, {}, {52, 126}, {127}, {128}, {129}, {130}, {}, {}, {53, 131}, {132}, {137}, {138}, {139}, {}, {}}),
    L45(45, new int[][]{{9, 10, 26, 54}, {11, 27, 55}, {23, 28, 56}, {29, 57}, {30, 69}, {24, 31, 70}, {32, 71}, {33, 72}, {73}, {74}, {75}, {25, 34, 76}, {46, 77}, {47, 78}, {79}, {80}, {110}, {48, 111}, {49, 112}, {113}, {114}, {115}, {116}, {50, 117}, {51, 122}, {123}, {124}, {125}, {}, {}, {52, 126}, {127}, {128}, {129}, {130}, {}, {}, {53, 131}, {132}, {137}, {138}, {139}, {}, {}}),
    L46(46, new int[][]{{9, 25, 53}, {10, 26, 54}, {11, 27, 55}, {28, 56}, {29, 57}, {23, 30, 69}, {31, 70}, {32, 71}, {72}, {73}, {74}, {24, 33, 75}, {34, 76}, {46, 77}, {78}, {79}, {80}, {47, 110}, {48, 111}, {112}, {113}, {114}, {115}, {116}, {49, 117}, {50, 122}, {123}, {124}, {125}, {}, {}, {51, 126}, {127}, {128}, {129}, {130}, {}, {}, {52, 131}, {132}, {137}, {138}, {139}, {}, {}}),
    L47(47, new int[][]{{9, 25, 53}, {10, 26, 54}, {11, 27, 55}, {28, 56}, {29, 57}, {23, 30, 69}, {31, 70}, {32, 71}, {72}, {73}, {74}, {24, 33, 75}, {34, 76}, {46, 77}, {78}, {79}, {80}, {110}, {47, 111}, {48, 112}, {113}, {114}, {115}, {116}, {117}, {49, 122}, {50, 123}, {124}, {125}, {126}, {}, {}, {51, 127}, {128}, {129}, {130}, {131}, {}, {}, {52, 132}, {137}, {138}, {139}, {}, {}, {}}),
    L48(48, new int[][]{{9, 25, 53}, {10, 26, 54}, {11, 27, 55}, {28, 56}, {29, 57}, {23, 30, 69}, {31, 70}, {32, 71}, {72}, {73}, {74}, {75}, {24, 33, 76}, {34, 77}, {46, 78}, {79}, {80}, {110}, {111}, {47, 112}, {48, 113}, {114}, {115}, {116}, {117}, {122}, {49, 123}, {50, 124}, {125}, {126}, {127}, {}, {}, {51, 128}, {129}, {130}, {131}, {}, {}, {}, {52, 132}, {137}, {138}, {139}, {}, {}, {}}),
    L49(49, new int[][]{{9, 25, 53}, {10, 26, 54}, {11, 27, 55}, {28, 56}, {29, 57}, {23, 30, 69}, {31, 70}, {32, 71}, {72}, {73}, {74}, {75}, {24, 33, 76}, {34, 77}, {46, 78}, {79}, {80}, {110}, {111}, {47, 112}, {48, 113}, {114}, {115}, {116}, {117}, {}, {49, 122}, {50, 123}, {124}, {125}, {126}, {}, {}, {51, 127}, {128}, {129}, {130}, {}, {}, {}, {52, 131}, {132}, {137}, {138}, {139}, {}, {}, {}}),
    L50(50, new int[][]{{9, 25, 53}, {10, 26, 54}, {11, 27, 55}, {28, 56}, {29, 57}, {23, 30, 69}, {31, 70}, {32, 71}, {72}, {73}, {74}, {75}, {24, 33, 76}, {34, 77}, {46, 78}, {79}, {80}, {110}, {111}, {47, 112}, {48, 113}, {114}, {115}, {116}, {117}, {}, {49, 122}, {50, 123}, {124}, {125}, {126}, {}, {}, {51, 127}, {128}, {129}, {130}, {131}, {}, {}, {}, {52, 132}, {137}, {138}, {139}, {}, {}, {}, {}}),
    L51(51, new int[][]{{9, 25, 52}, {10, 26, 53}, {11, 27, 54}, {28, 55}, {29, 56}, {23, 30, 57}, {31, 69}, {32, 70}, {71}, {72}, {73}, {74}, {24, 33, 75}, {34, 76}, {77}, {78}, {79}, {80}, {110}, {46, 111}, {47, 112}, {113}, {114}, {115}, {116}, {}, {48, 117}, {49, 122}, {123}, {124}, {125}, {}, {}, {}, {50, 126}, {127}, {128}, {129}, {130}, {}, {}, {}, {51, 131}, {132}, {137}, {138}, {139}, {}, {}, {}}),
    L52(52, new int[][]{{9, 24, 51}, {10, 25, 52}, {26, 53}, {27, 54}, {28, 55}, {11, 29, 56}, {30, 57}, {69}, {70}, {71}, {72}, {73}, {23, 31, 74}, {32, 75}, {33, 76}, {77}, {78}, {79}, {80}, {34, 110}, {46, 111}, {112}, {113}, {114}, {115}, {116}, {}, {47, 117}, {48, 122}, {123}, {124}, {125}, {}, {}, {}, {49, 126}, {127}, {128}, {129}, {130}, {}, {}, {}, {50, 131}, {132}, {137}, {138}, {139}, {}, {}, {}}),
    L53(53, new int[][]{{9, 24, 51}, {10, 25, 52}, {26, 53}, {27, 54}, {28, 55}, {11, 29, 56}, {30, 57}, {69}, {70}, {71}, {72}, {73}, {23, 31, 74}, {32, 75}, {33, 76}, {77}, {78}, {79}, {80}, {110}, {34, 111}, {46, 112}, {113}, {114}, {115}, {116}, {117}, {}, {47, 122}, {48, 123}, {124}, {125}, {126}, {}, {}, {}, {49, 127}, {128}, {129}, {130}, {131}, {}, {}, {}, {50, 132}, {137}, {138}, {139}, {}, {}, {}, {}}),
    L54(54, new int[][]{{9, 24, 52}, {10, 25, 53}, {26, 54}, {27, 55}, {28, 56}, {11, 29, 57}, {30, 69}, {31, 70}, {71}, {72}, {73}, {74}, {}, {23, 32, 75}, {33, 76}, {34, 77}, {78}, {79}, {80}, {110}, {}, {46, 111}, {47, 112}, {113}, {114}, {115}, {116}, {117}, {}, {48, 122}, {49, 123}, {124}, {125}, {126}, {}, {}, {}, {50, 127}, {128}, {129}, {130}, {131}, {}, {}, {}, {51, 132}, {137}, {138}, {139}, {}, {}, {}, {}}),
    L55(55, new int[][]{{9, 24, 52}, {10, 25, 53}, {26, 54}, {27, 55}, {28, 56}, {11, 29, 57}, {30, 69}, {31, 70}, {71}, {72}, {73}, {74}, {}, {23, 32, 75}, {33, 76}, {34, 77}, {78}, {79}, {80}, {110}, {}, {46, 111}, {47, 112}, {113}, {114}, {115}, {116}, {117}, {}, {48, 122}, {49, 123}, {124}, {125}, {126}, {}, {}, {}, {50, 127}, {128}, {129}, {130}, {}, {}, {}, {}, {51, 131}, {132}, {137}, {138}, {139}, {}, {}, {}, {}}),
    L56(56, new int[][]{{9, 24, 52}, {10, 25, 53}, {26, 54}, {27, 55}, {28, 56}, {11, 29, 57}, {30, 69}, {31, 70}, {71}, {72}, {73}, {74}, {}, {23, 32, 75}, {33, 76}, {34, 77}, {78}, {79}, {80}, {110}, {}, {46, 111}, {47, 112}, {113}, {114}, {115}, {116}, {117}, {}, {48, 122}, {49, 123}, {124}, {125}, {126}, {}, {}, {}, {50, 127}, {128}, {129}, {130}, {131}, {}, {}, {}, {}, {51, 132}, {137}, {138}, {139}, {}, {}, {}, {}, {}});

    private int mL;
    private int[][] mIndexes;

    private static Map<Integer,QuantizedValueIndexes> sLOOKUP_MAP = new TreeMap<>();

    static
    {
        for(QuantizedValueIndexes indexes : QuantizedValueIndexes.values())
        {
            sLOOKUP_MAP.put(indexes.mL, indexes);
        }
    }

    QuantizedValueIndexes(int L, int[][] indexes)
    {
        mL = L;
        mIndexes = indexes;
    }

    /**
     * Quantized indexes array for coefficient b3 thorugh b(L + 1)
     */
    public int[][] getIndexes()
    {
        return mIndexes;
    }

    /**
     * Lookup the message indexes from a value of L frequency band
     */
    public static QuantizedValueIndexes fromL(int L)
    {
        return sLOOKUP_MAP.get(L);
    }
}

