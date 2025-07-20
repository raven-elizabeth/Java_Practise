package Diamond;
import beginner.Diamond;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class DiamondTest {

    @Test
    public void testBasicBuildDiamond(){
        Assertions.assertEquals(
                """
                           A
                          B B
                         C   C
                          B B
                           A
                         """,
                Diamond.buildDiamond('C')
        );
    }

    @Test
    public void testSingleBuildDiamond(){
        Assertions.assertEquals("A", Diamond.buildDiamond('A'));
    }

    @Test
    public void testAllBuildDiamond(){
        Assertions.assertEquals(
                """
                                                 A
                                                B B
                                               C   C
                                              D     D
                                             E       E
                                            F         F
                                           G           G
                                          H             H
                                         I               I
                                        J                 J
                                       K                   K
                                      L                     L
                                     M                       M
                                    N                         N
                                   O                           O
                                  P                             P
                                 Q                               Q
                                R                                 R
                               S                                   S
                              T                                     T
                             U                                       U
                            V                                         V
                           W                                           W
                          X                                             X
                         Y                                               Y
                        Z                                                 Z
                         Y                                               Y
                          X                                             X
                           W                                           W
                            V                                         V
                             U                                       U
                              T                                     T
                               S                                   S
                                R                                 R
                                 Q                               Q
                                  P                             P
                                   O                           O
                                    N                         N
                                     M                       M
                                      L                     L
                                       K                   K
                                        J                 J
                                         I               I
                                          H             H
                                           G           G
                                            F         F
                                             E       E
                                              D     D
                                               C   C
                                                B B
                                                 A
                        """,
                Diamond.buildDiamond('Z')
        );
    }

    @Test
    public void testTwoBuildDiamond(){
        Assertions.assertEquals(
                """
                         A
                        B B
                         A
                        """,
                Diamond.buildDiamond('B')
        );
    }

    @Test
    public void testAllButOneBuildDiamond(){
        Assertions.assertEquals(
                """
                                                A
                                               B B
                                              C   C
                                             D     D
                                            E       E
                                           F         F
                                          G           G
                                         H             H
                                        I               I
                                       J                 J
                                      K                   K
                                     L                     L
                                    M                       M
                                   N                         N
                                  O                           O
                                 P                             P
                                Q                               Q
                               R                                 R
                              S                                   S
                             T                                     T
                            U                                       U
                           V                                         V
                          W                                           W
                         X                                             X
                        Y                                               Y
                         X                                             X
                          W                                           W
                           V                                         V
                            U                                       U
                             T                                     T
                              S                                   S
                               R                                 R
                                Q                               Q
                                 P                             P
                                  O                           O
                                   N                         N
                                    M                       M
                                     L                     L
                                      K                   K
                                       J                 J
                                        I               I
                                         H             H
                                          G           G
                                           F         F
                                            E       E
                                             D     D
                                              C   C
                                               B B
                                                A
                        """,
                Diamond.buildDiamond('Y')
        );
    }

    @Test
    public void testMiddleBuildDiamond(){
        Assertions.assertEquals(
                """
                                    A
                                   B B
                                  C   C
                                 D     D
                                E       E
                               F         F
                              G           G
                             H             H
                            I               I
                           J                 J
                          K                   K
                         L                     L
                        M                       M
                         L                     L
                          K                   K
                           J                 J
                            I               I
                             H             H
                              G           G
                               F         F
                                E       E
                                 D     D
                                  C   C
                                   B B
                                    A
                        """,
                Diamond.buildDiamond('M')
        );
    }

    @Test
    public void testInvalidIntBuildDiamond() {
        ByteArrayInputStream exampleInput = new ByteArrayInputStream("2".getBytes());
        System.setIn(exampleInput);
        Assertions.assertThrows(Exception.class, Diamond::getUserLetter);
    }

    @Test
    public void testLowerCaseGetUserLetter() throws Exception {
        ByteArrayInputStream exampleInput = new ByteArrayInputStream("c".getBytes());
        System.setIn(exampleInput);
        Assertions.assertFalse(Character.isLowerCase(Diamond.getUserLetter()));
    }

    @Test
    public void testStringGetUserLetter() throws Exception {
        ByteArrayInputStream exampleInput = new ByteArrayInputStream("EAG".getBytes());
        System.setIn(exampleInput);
        Assertions.assertEquals('E', Diamond.getUserLetter());
    }

}
