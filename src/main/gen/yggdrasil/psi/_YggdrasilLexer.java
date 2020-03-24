// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: yggdrasil.flex

package yggdrasil.psi;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static yggdrasil.psi.YggdrasilTypes.*;


public class _YggdrasilLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\2\u1f00\1\u2200\1\u2300"+
    "\2\u1f00\31\u0100\1\u2400\121\u0100\1\u2500\4\u0100\1\u2600\1\u0100"+
    "\1\u2700\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\53\u0100\1\u2d00"+
    "\10\u2e00\31\u1f00\1\u0100\1\u2f00\1\u3000\1\u3100\1\u3200\1\u3300"+
    "\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900\1\u3a00\1\u0100"+
    "\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u4100\1\u1f00"+
    "\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800\1\u4900"+
    "\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u1f00\1\u4e00\1\u4f00\1\u5000"+
    "\1\u1f00\3\u0100\1\u5100\1\u5200\1\u5300\12\u1f00\4\u0100\1\u5400"+
    "\17\u1f00\2\u0100\1\u5500\41\u1f00\2\u0100\1\u5600\1\u5700\2\u1f00"+
    "\1\u5800\1\u5900\27\u0100\1\u5a00\2\u0100\1\u5b00\45\u1f00\1\u0100"+
    "\1\u5c00\1\u5d00\11\u1f00\1\u5e00\24\u1f00\1\u5f00\1\u6000\1\u1f00"+
    "\1\u6100\1\u6200\1\u6300\1\u6400\2\u1f00\1\u6500\5\u1f00\1\u6600"+
    "\1\u6700\1\u6800\5\u1f00\1\u6900\1\u6a00\4\u1f00\1\u6b00\21\u1f00"+
    "\246\u0100\1\u6c00\20\u0100\1\u6d00\1\u6e00\25\u0100\1\u6f00\34\u0100"+
    "\1\u7000\14\u1f00\2\u0100\1\u7100\u0b06\u1f00\1\u7200\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\0"+
    "\1\4\1\5\1\6\2\0\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\12\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\32\30\1\31\1\32"+
    "\1\33\1\34\1\30\1\35\1\36\1\37\1\40\1\30"+
    "\1\41\1\30\1\42\1\30\1\43\1\30\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\30\1\52\1\53\1\54"+
    "\1\55\5\30\1\56\1\57\1\60\1\61\6\0\1\3"+
    "\32\0\1\1\11\0\1\30\12\0\1\30\1\0\1\62"+
    "\2\0\1\30\5\0\27\30\1\0\37\30\1\0\u01ca\30"+
    "\4\0\14\30\16\0\5\30\7\0\1\30\1\0\1\30"+
    "\21\0\160\62\5\30\1\0\2\30\3\0\3\30\1\0"+
    "\1\30\6\0\1\30\1\62\3\30\1\0\1\30\1\0"+
    "\24\30\1\0\123\30\1\0\213\30\1\0\5\62\2\0"+
    "\246\30\1\0\46\30\2\0\1\30\6\0\51\30\10\0"+
    "\55\62\1\0\1\62\1\0\2\62\1\0\2\62\1\0"+
    "\1\62\10\0\33\30\4\0\4\30\35\0\13\62\5\0"+
    "\53\30\37\62\4\0\2\30\1\62\143\30\1\0\1\30"+
    "\7\62\2\0\6\62\2\30\2\62\1\0\4\62\2\30"+
    "\12\62\3\30\2\0\1\30\20\0\1\30\1\62\36\30"+
    "\33\62\2\0\131\30\13\62\1\30\16\0\12\62\41\30"+
    "\11\62\2\30\4\0\1\30\2\0\1\62\2\0\26\30"+
    "\4\62\1\30\11\62\1\30\3\62\1\30\5\62\22\0"+
    "\31\30\3\62\4\0\13\30\65\0\25\30\1\0\10\30"+
    "\25\0\17\62\1\0\41\62\66\30\3\62\1\30\22\62"+
    "\1\30\7\62\12\30\2\62\2\0\12\62\1\0\20\30"+
    "\3\62\1\0\10\30\2\0\2\30\2\0\26\30\1\0"+
    "\7\30\1\0\1\30\3\0\4\30\2\0\1\62\1\30"+
    "\7\62\2\0\2\62\2\0\3\62\1\30\10\0\1\62"+
    "\4\0\2\30\1\0\3\30\2\62\2\0\12\62\2\30"+
    "\12\0\1\30\1\0\1\62\2\0\3\62\1\0\6\30"+
    "\4\0\2\30\2\0\26\30\1\0\7\30\1\0\2\30"+
    "\1\0\2\30\1\0\2\30\2\0\1\62\1\0\5\62"+
    "\4\0\2\62\2\0\3\62\3\0\1\62\7\0\4\30"+
    "\1\0\1\30\7\0\14\62\3\30\1\62\13\0\3\62"+
    "\1\0\11\30\1\0\3\30\1\0\26\30\1\0\7\30"+
    "\1\0\2\30\1\0\5\30\2\0\1\62\1\30\10\62"+
    "\1\0\3\62\1\0\3\62\2\0\1\30\17\0\2\30"+
    "\2\62\2\0\12\62\11\0\1\30\6\62\1\0\3\62"+
    "\1\0\10\30\2\0\2\30\2\0\26\30\1\0\7\30"+
    "\1\0\2\30\1\0\5\30\2\0\1\62\1\30\7\62"+
    "\2\0\2\62\2\0\3\62\10\0\2\62\4\0\2\30"+
    "\1\0\3\30\2\62\2\0\12\62\1\0\1\30\20\0"+
    "\1\62\1\30\1\0\6\30\3\0\3\30\1\0\4\30"+
    "\3\0\2\30\1\0\1\30\1\0\2\30\3\0\2\30"+
    "\3\0\3\30\3\0\14\30\4\0\5\62\3\0\3\62"+
    "\1\0\4\62\2\0\1\30\6\0\1\62\16\0\12\62"+
    "\20\0\5\62\10\30\1\0\3\30\1\0\27\30\1\0"+
    "\20\30\3\0\1\30\7\62\1\0\3\62\1\0\4\62"+
    "\7\0\2\62\1\0\3\30\5\0\2\30\2\62\2\0"+
    "\12\62\20\0\1\30\3\62\1\0\10\30\1\0\3\30"+
    "\1\0\27\30\1\0\12\30\1\0\5\30\2\0\1\62"+
    "\1\30\7\62\1\0\3\62\1\0\4\62\7\0\2\62"+
    "\7\0\1\30\1\0\2\30\2\62\2\0\12\62\1\0"+
    "\2\30\15\0\4\62\1\0\10\30\1\0\3\30\1\0"+
    "\51\30\2\62\1\30\7\62\1\0\3\62\1\0\4\62"+
    "\1\30\5\0\3\30\1\62\7\0\3\30\2\62\2\0"+
    "\12\62\12\0\6\30\2\0\2\62\1\0\22\30\3\0"+
    "\30\30\1\0\11\30\1\0\1\30\2\0\7\30\3\0"+
    "\1\62\4\0\6\62\1\0\1\62\1\0\10\62\6\0"+
    "\12\62\2\0\2\62\15\0\60\30\1\62\1\30\10\62"+
    "\5\0\7\30\10\62\1\0\12\62\47\0\2\30\1\0"+
    "\1\30\1\0\5\30\1\0\30\30\1\0\1\30\1\0"+
    "\12\30\1\62\1\30\12\62\1\30\2\0\5\30\1\0"+
    "\1\30\1\0\6\62\2\0\12\62\2\0\4\30\40\0"+
    "\1\30\27\0\2\62\6\0\12\62\13\0\1\62\1\0"+
    "\1\62\1\0\1\62\4\0\2\62\10\30\1\0\44\30"+
    "\4\0\24\62\1\0\2\62\5\30\13\62\1\0\44\62"+
    "\11\0\1\62\71\0\53\30\24\62\1\30\12\62\6\0"+
    "\6\30\4\62\4\30\3\62\1\30\3\62\2\30\7\62"+
    "\3\30\4\62\15\30\14\62\1\30\17\62\2\0\46\30"+
    "\1\0\1\30\5\0\1\30\2\0\53\30\1\0\115\30"+
    "\1\0\4\30\2\0\7\30\1\0\1\30\1\0\4\30"+
    "\2\0\51\30\1\0\4\30\2\0\41\30\1\0\4\30"+
    "\2\0\7\30\1\0\1\30\1\0\4\30\2\0\17\30"+
    "\1\0\71\30\1\0\4\30\2\0\103\30\2\0\3\62"+
    "\11\0\11\62\16\0\20\30\20\0\126\30\2\0\6\30"+
    "\3\0\u016c\30\2\0\21\30\1\1\32\30\5\0\113\30"+
    "\3\0\13\30\7\0\15\30\1\0\4\30\3\62\13\0"+
    "\22\30\3\62\13\0\22\30\2\62\14\0\15\30\1\0"+
    "\3\30\1\0\2\62\14\0\64\30\40\62\3\0\1\30"+
    "\4\0\1\30\1\62\2\0\12\62\41\0\3\62\2\0"+
    "\12\62\6\0\131\30\7\0\51\30\1\62\1\30\5\0"+
    "\106\30\12\0\37\30\1\0\14\62\4\0\14\62\12\0"+
    "\12\62\36\30\2\0\5\30\13\0\54\30\4\0\32\30"+
    "\6\0\13\62\45\0\27\30\5\62\4\0\65\30\12\62"+
    "\1\0\35\62\2\0\13\62\6\0\12\62\15\0\1\30"+
    "\10\0\16\62\102\0\5\62\57\30\21\62\7\30\4\0"+
    "\12\62\21\0\11\62\14\0\3\62\36\30\15\62\2\30"+
    "\12\62\54\30\16\62\14\0\44\30\24\62\10\0\12\62"+
    "\3\0\3\30\12\62\44\30\2\0\11\30\7\0\53\30"+
    "\2\0\3\30\20\0\3\62\1\0\25\62\4\30\1\62"+
    "\6\30\1\62\2\30\3\62\1\30\5\0\300\30\72\62"+
    "\1\0\5\62\26\30\2\0\6\30\2\0\46\30\2\0"+
    "\6\30\2\0\10\30\1\0\1\30\1\0\1\30\1\0"+
    "\1\30\1\0\37\30\2\0\65\30\1\0\7\30\1\0"+
    "\1\30\3\0\3\30\1\0\7\30\3\0\4\30\2\0"+
    "\6\30\4\0\15\30\5\0\3\30\1\0\7\30\3\0"+
    "\13\1\35\0\2\3\5\0\1\1\17\0\2\62\23\0"+
    "\1\62\12\0\1\1\21\0\1\30\15\0\1\30\20\0"+
    "\15\30\63\0\15\62\4\0\1\62\3\0\14\62\21\0"+
    "\1\30\4\0\1\30\2\0\12\30\1\0\1\30\2\0"+
    "\6\30\6\0\1\30\1\0\1\30\1\0\1\30\1\0"+
    "\20\30\2\0\4\30\5\0\5\30\4\0\1\30\21\0"+
    "\51\30\u0177\0\57\30\1\0\57\30\1\0\205\30\6\0"+
    "\4\30\3\62\2\30\14\0\46\30\1\0\1\30\5\0"+
    "\1\30\2\0\70\30\7\0\1\30\17\0\1\62\27\30"+
    "\11\0\7\30\1\0\7\30\1\0\7\30\1\0\7\30"+
    "\1\0\7\30\1\0\7\30\1\0\7\30\1\0\7\30"+
    "\1\0\40\62\1\1\4\0\3\30\31\0\11\30\6\62"+
    "\1\0\5\30\2\0\5\30\4\0\126\30\2\0\2\62"+
    "\2\0\3\30\1\0\132\30\1\0\4\30\5\0\53\30"+
    "\1\0\136\30\21\0\33\30\65\0\306\30\112\0\360\30"+
    "\20\0\215\30\103\0\56\30\2\0\15\30\3\0\20\30"+
    "\12\62\2\30\24\0\57\30\1\62\4\0\12\62\1\0"+
    "\37\30\2\62\120\30\2\62\45\0\11\30\2\0\147\30"+
    "\2\0\65\30\2\0\5\30\60\0\13\30\1\62\3\30"+
    "\1\62\4\30\1\62\27\30\5\62\30\0\64\30\14\0"+
    "\2\62\62\30\22\62\12\0\12\62\6\0\22\62\6\30"+
    "\3\0\1\30\1\0\2\30\13\62\34\30\10\62\2\0"+
    "\27\30\15\62\14\0\35\30\3\0\4\62\57\30\16\62"+
    "\16\0\1\30\12\62\6\0\5\30\1\62\12\30\12\62"+
    "\5\30\1\0\51\30\16\62\11\0\3\30\1\62\10\30"+
    "\2\62\2\0\12\62\6\0\27\30\3\0\1\30\3\62"+
    "\62\30\1\62\1\30\3\62\2\30\2\62\5\30\2\62"+
    "\1\30\1\62\1\30\30\0\3\30\2\0\13\30\5\62"+
    "\2\0\3\30\2\62\12\0\6\30\2\0\6\30\2\0"+
    "\6\30\11\0\7\30\1\0\7\30\1\0\53\30\1\0"+
    "\14\30\10\0\163\30\10\62\1\0\2\62\2\0\12\62"+
    "\6\0\244\30\14\0\27\30\4\0\61\30\4\0\u0100\63"+
    "\156\30\2\0\152\30\46\0\7\30\14\0\5\30\5\0"+
    "\1\30\1\62\12\30\1\0\15\30\1\0\5\30\1\0"+
    "\1\30\1\0\2\30\1\0\2\30\1\0\154\30\41\0"+
    "\213\30\6\0\332\30\22\0\100\30\2\0\66\30\50\0"+
    "\12\30\6\0\20\62\20\0\20\62\3\0\2\62\30\0"+
    "\3\62\41\0\1\30\1\0\1\30\3\0\1\30\1\0"+
    "\1\30\1\0\1\30\1\0\1\30\1\0\176\30\23\0"+
    "\12\62\7\0\32\30\4\0\1\62\1\0\32\30\13\0"+
    "\70\30\2\62\37\30\3\0\6\30\2\0\6\30\2\0"+
    "\6\30\2\0\3\30\43\0\14\30\1\0\32\30\1\0"+
    "\23\30\1\0\2\30\1\0\17\30\2\0\16\30\42\0"+
    "\173\30\105\0\65\30\210\0\1\62\202\0\35\30\3\0"+
    "\61\30\17\0\1\62\37\0\40\30\15\0\36\30\5\0"+
    "\46\30\5\62\5\0\36\30\2\0\44\30\4\0\10\30"+
    "\1\0\5\30\52\0\236\30\2\0\12\62\6\0\44\30"+
    "\4\0\44\30\4\0\50\30\10\0\64\30\234\0\67\30"+
    "\11\0\26\30\12\0\10\30\230\0\6\30\2\0\1\30"+
    "\1\0\54\30\1\0\2\30\3\0\1\30\2\0\27\30"+
    "\12\0\27\30\11\0\37\30\101\0\23\30\1\0\2\30"+
    "\12\0\26\30\12\0\32\30\106\0\70\30\6\0\2\30"+
    "\100\0\1\30\3\62\1\0\2\62\5\0\4\62\4\30"+
    "\1\0\3\30\1\0\35\30\2\0\3\62\4\0\1\62"+
    "\40\0\35\30\3\0\35\30\43\0\10\30\1\0\34\30"+
    "\2\62\31\0\66\30\12\0\26\30\12\0\23\30\15\0"+
    "\22\30\156\0\111\30\67\0\63\30\15\0\63\30\15\0"+
    "\44\30\4\62\10\0\12\62\306\0\35\30\12\0\1\30"+
    "\10\0\26\30\13\62\217\0\27\30\11\0\3\62\65\30"+
    "\17\62\37\0\12\62\17\0\4\62\55\30\13\62\25\0"+
    "\31\30\7\0\12\62\6\0\3\62\44\30\16\62\1\0"+
    "\12\62\4\0\1\30\2\62\11\0\43\30\1\62\2\0"+
    "\1\30\11\0\3\62\60\30\16\62\4\30\4\0\4\62"+
    "\3\0\12\62\1\30\1\0\1\30\43\0\22\30\1\0"+
    "\31\30\14\62\6\0\1\62\101\0\7\30\1\0\1\30"+
    "\1\0\4\30\1\0\17\30\1\0\12\30\7\0\57\30"+
    "\14\62\5\0\12\62\6\0\4\62\1\0\10\30\2\0"+
    "\2\30\2\0\26\30\1\0\7\30\1\0\2\30\1\0"+
    "\5\30\1\0\2\62\1\30\7\62\2\0\2\62\2\0"+
    "\3\62\2\0\1\30\6\0\1\62\5\0\5\30\2\62"+
    "\2\0\7\62\3\0\5\62\213\0\65\30\22\62\4\30"+
    "\5\0\12\62\4\0\1\62\1\30\40\0\60\30\24\62"+
    "\2\30\1\0\1\30\10\0\12\62\246\0\57\30\7\62"+
    "\2\0\11\62\27\0\4\30\2\62\42\0\60\30\21\62"+
    "\3\0\1\30\13\0\12\62\46\0\53\30\15\62\1\30"+
    "\7\0\12\62\66\0\33\30\2\0\17\62\4\0\12\62"+
    "\306\0\54\30\17\62\145\0\100\30\12\62\25\0\1\30"+
    "\240\0\10\30\2\0\47\30\7\62\2\0\7\62\1\30"+
    "\1\0\1\30\1\62\33\0\1\30\12\62\50\30\7\62"+
    "\1\30\4\62\10\0\1\62\10\0\1\30\13\62\56\30"+
    "\20\62\3\0\1\30\42\0\71\30\7\0\11\30\1\0"+
    "\45\30\10\62\1\0\10\62\1\30\17\0\12\62\30\0"+
    "\36\30\2\0\26\62\1\0\16\62\111\0\7\30\1\0"+
    "\2\30\1\0\46\30\6\62\3\0\1\62\1\0\2\62"+
    "\1\0\7\62\1\30\1\62\10\0\12\62\6\0\6\30"+
    "\1\0\2\30\1\0\40\30\5\62\1\0\2\62\1\0"+
    "\5\62\1\30\7\0\12\62\u0136\0\23\30\4\62\11\0"+
    "\232\30\146\0\157\30\21\0\304\30\274\0\57\30\321\0"+
    "\107\30\271\0\71\30\7\0\37\30\1\0\12\62\146\0"+
    "\36\30\2\0\5\62\13\0\60\30\7\62\11\0\4\30"+
    "\14\0\12\62\11\0\25\30\5\0\23\30\260\0\100\30"+
    "\200\0\113\30\4\0\1\62\1\30\67\62\7\0\4\62"+
    "\15\30\100\0\2\30\1\0\1\30\34\0\370\30\10\0"+
    "\363\30\15\0\37\30\61\0\3\30\21\0\4\30\10\0"+
    "\u018c\30\4\0\153\30\5\0\15\30\3\0\11\30\7\0"+
    "\12\30\3\0\2\62\306\0\5\62\3\0\6\62\10\0"+
    "\10\62\2\0\7\62\36\0\4\62\224\0\3\62\273\0"+
    "\125\30\1\0\107\30\1\0\2\30\2\0\1\30\2\0"+
    "\2\30\2\0\4\30\1\0\14\30\1\0\1\30\1\0"+
    "\7\30\1\0\101\30\1\0\4\30\2\0\10\30\1\0"+
    "\7\30\1\0\34\30\1\0\4\30\1\0\5\30\1\0"+
    "\1\30\3\0\7\30\1\0\u0154\30\2\0\31\30\1\0"+
    "\31\30\1\0\37\30\1\0\31\30\1\0\37\30\1\0"+
    "\31\30\1\0\37\30\1\0\31\30\1\0\37\30\1\0"+
    "\31\30\1\0\10\30\2\0\151\62\4\0\62\62\10\0"+
    "\1\62\16\0\1\62\26\0\5\62\1\0\17\62\120\0"+
    "\7\62\1\0\21\62\2\0\7\62\1\0\2\62\1\0"+
    "\5\62\325\0\55\30\3\0\7\62\7\30\2\0\12\62"+
    "\4\0\1\30\u0171\0\54\30\16\62\6\0\305\30\13\0"+
    "\7\62\51\0\104\30\7\62\1\30\4\0\12\62\246\0"+
    "\4\30\1\0\33\30\1\0\2\30\1\0\1\30\2\0"+
    "\1\30\1\0\12\30\1\0\4\30\1\0\1\30\1\0"+
    "\1\30\6\0\1\30\4\0\1\30\1\0\1\30\1\0"+
    "\1\30\1\0\3\30\1\0\2\30\1\0\1\30\2\0"+
    "\1\30\1\0\1\30\1\0\1\30\1\0\1\30\1\0"+
    "\1\30\1\0\2\30\1\0\1\30\2\0\4\30\1\0"+
    "\7\30\1\0\4\30\1\0\4\30\1\0\1\30\1\0"+
    "\12\30\1\0\21\30\5\0\3\30\1\0\5\30\1\0"+
    "\21\30\104\0\327\30\51\0\65\30\13\0\336\30\2\0"+
    "\u0182\30\16\0\u0131\30\37\0\36\30\342\0\360\62\20\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[29440];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\1\1\27\1\30\1\1\11\25\1\31\1\32"+
    "\1\33\1\34\1\0\1\35\2\0\1\36\1\0\1\37"+
    "\2\0\1\40\2\0\1\41\1\42\1\0\1\43\1\44"+
    "\10\25\1\35\1\36\1\45\1\0\1\45\1\0\12\25"+
    "\1\46\2\0\2\25\1\47\7\25\1\50\1\25\1\51"+
    "\1\25\1\52\2\25\1\53\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[105];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\64\0\64\0\320\0\64"+
    "\0\64\0\64\0\64\0\64\0\u0104\0\64\0\u0138\0\u016c"+
    "\0\64\0\64\0\64\0\64\0\64\0\64\0\64\0\u01a0"+
    "\0\u01d4\0\u0208\0\64\0\64\0\u023c\0\u0270\0\u02a4\0\u02d8"+
    "\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\64\0\64"+
    "\0\64\0\64\0\234\0\64\0\u0444\0\320\0\64\0\u0478"+
    "\0\64\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u01d4\0\64\0\64"+
    "\0\u023c\0\64\0\u01a0\0\u057c\0\u05b0\0\u05e4\0\u0618\0\u064c"+
    "\0\u0680\0\u06b4\0\u06e8\0\234\0\320\0\64\0\u071c\0\u0750"+
    "\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0"+
    "\0\u0924\0\u0958\0\u098c\0\64\0\u0750\0\u09c0\0\u09f4\0\u0a28"+
    "\0\u01a0\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94"+
    "\0\u01a0\0\u0bc8\0\u01a0\0\u0bfc\0\u01a0\0\u0c30\0\u0c64\0\u01a0"+
    "\0\u01a0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[105];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\30\1\37\1\40"+
    "\1\41\1\42\2\30\1\43\4\30\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\2\2\65\0\3\3\60\0"+
    "\4\53\1\54\25\53\1\55\31\53\7\56\1\57\22\56"+
    "\1\60\31\56\25\0\1\61\36\0\12\62\1\63\4\62"+
    "\1\64\12\62\1\65\31\62\20\0\1\20\63\0\1\30"+
    "\7\0\1\30\5\0\20\30\4\0\1\30\1\0\33\66"+
    "\1\67\30\66\2\70\2\0\57\70\1\0\35\71\1\72"+
    "\26\71\20\0\1\30\7\0\1\30\5\0\15\30\1\73"+
    "\2\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\7\30\1\74\10\30\4\0\1\30\21\0\1\30\7\0"+
    "\1\30\5\0\11\30\1\75\6\30\4\0\1\30\21\0"+
    "\1\30\7\0\1\30\5\0\14\30\1\76\3\30\4\0"+
    "\1\30\21\0\1\30\7\0\1\30\5\0\10\30\1\77"+
    "\7\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\1\100\17\30\4\0\1\30\21\0\1\30\7\0\1\30"+
    "\5\0\16\30\1\101\1\30\4\0\1\30\21\0\1\30"+
    "\7\0\1\30\5\0\12\30\1\102\5\30\4\0\1\30"+
    "\21\0\1\30\7\0\1\30\5\0\11\30\1\103\6\30"+
    "\4\0\1\30\1\0\4\53\1\104\25\53\1\55\31\53"+
    "\7\56\1\105\22\56\1\60\31\56\17\62\1\106\12\62"+
    "\1\65\31\62\12\63\1\107\4\63\1\110\12\63\1\111"+
    "\31\63\2\64\1\0\61\64\2\62\2\0\57\62\21\0"+
    "\1\30\7\0\1\30\5\0\1\112\4\30\1\113\12\30"+
    "\4\0\1\30\21\0\1\30\7\0\1\30\5\0\17\30"+
    "\1\114\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\1\115\11\30\1\116\5\30\4\0\1\30\21\0\1\30"+
    "\7\0\1\30\5\0\13\30\1\117\4\30\4\0\1\30"+
    "\21\0\1\30\7\0\1\30\5\0\2\30\1\120\15\30"+
    "\4\0\1\30\21\0\1\30\7\0\1\30\5\0\14\30"+
    "\1\121\3\30\4\0\1\30\21\0\1\30\7\0\1\30"+
    "\5\0\6\30\1\122\11\30\4\0\1\30\21\0\1\30"+
    "\7\0\1\30\5\0\5\30\1\123\12\30\4\0\1\30"+
    "\1\0\12\63\1\107\4\63\1\124\12\63\1\111\31\63"+
    "\12\125\1\126\51\125\2\63\2\125\6\63\1\107\50\63"+
    "\1\125\20\0\1\30\7\0\1\30\5\0\15\30\1\127"+
    "\2\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\10\30\1\130\7\30\4\0\1\30\21\0\1\30\7\0"+
    "\1\30\5\0\10\30\1\131\7\30\4\0\1\30\21\0"+
    "\1\30\7\0\1\30\5\0\10\30\1\132\7\30\4\0"+
    "\1\30\21\0\1\30\7\0\1\30\5\0\17\30\1\133"+
    "\4\0\1\30\21\0\1\30\7\0\1\30\5\0\12\30"+
    "\1\134\5\30\4\0\1\30\21\0\1\30\7\0\1\30"+
    "\5\0\14\30\1\135\3\30\4\0\1\30\21\0\1\30"+
    "\7\0\1\30\5\0\17\30\1\136\4\0\1\30\21\0"+
    "\1\30\7\0\1\30\5\0\3\30\1\137\14\30\4\0"+
    "\1\30\21\0\1\30\7\0\1\30\5\0\12\30\1\140"+
    "\5\30\4\0\1\30\1\0\12\125\1\126\4\125\1\124"+
    "\44\125\20\0\1\30\7\0\1\30\5\0\15\30\1\141"+
    "\2\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\1\30\1\131\16\30\4\0\1\30\21\0\1\30\7\0"+
    "\1\30\5\0\10\30\1\142\7\30\4\0\1\30\21\0"+
    "\1\30\7\0\1\30\5\0\13\30\1\143\4\30\4\0"+
    "\1\30\21\0\1\30\7\0\1\30\5\0\14\30\1\144"+
    "\3\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\12\30\1\145\5\30\4\0\1\30\21\0\1\30\7\0"+
    "\1\30\5\0\2\30\1\146\15\30\4\0\1\30\21\0"+
    "\1\30\7\0\1\30\5\0\11\30\1\143\6\30\4\0"+
    "\1\30\21\0\1\30\7\0\1\30\5\0\11\30\1\131"+
    "\6\30\4\0\1\30\21\0\1\30\7\0\1\30\5\0"+
    "\1\147\17\30\4\0\1\30\21\0\1\30\7\0\1\30"+
    "\5\0\16\30\1\150\1\30\4\0\1\30\21\0\1\30"+
    "\7\0\1\30\5\0\16\30\1\141\1\30\4\0\1\30"+
    "\21\0\1\30\7\0\1\30\5\0\14\30\1\151\3\30"+
    "\4\0\1\30\1\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[3224];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\2\11\1\1\5\11\1\1\1\11"+
    "\2\1\7\11\3\1\2\11\12\1\4\11\1\0\1\11"+
    "\2\0\1\11\1\0\1\11\2\0\1\1\2\0\2\11"+
    "\1\0\1\11\13\1\1\11\1\0\1\1\1\0\12\1"+
    "\1\11\2\0\23\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[105];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _YggdrasilLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return BAD_CHARACTER;
            }
          // fall through
          case 45: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 46: break;
          case 3:
            { return HASH;
            }
          // fall through
          case 47: break;
          case 4:
            { return DOLLAR;
            }
          // fall through
          case 48: break;
          case 5:
            { return PARENTHESIS_L;
            }
          // fall through
          case 49: break;
          case 6:
            { return PARENTHESIS_R;
            }
          // fall through
          case 50: break;
          case 7:
            { return OP_MANY;
            }
          // fall through
          case 51: break;
          case 8:
            { return OP_MANY1;
            }
          // fall through
          case 52: break;
          case 9:
            { return COMMA;
            }
          // fall through
          case 53: break;
          case 10:
            { return HYPHEN;
            }
          // fall through
          case 54: break;
          case 11:
            { return DOT;
            }
          // fall through
          case 55: break;
          case 12:
            { return SLASH;
            }
          // fall through
          case 56: break;
          case 13:
            { return INTEGER;
            }
          // fall through
          case 57: break;
          case 14:
            { return COLON;
            }
          // fall through
          case 58: break;
          case 15:
            { return SEMICOLON;
            }
          // fall through
          case 59: break;
          case 16:
            { return ANGLE_L;
            }
          // fall through
          case 60: break;
          case 17:
            { return EQ;
            }
          // fall through
          case 61: break;
          case 18:
            { return ANGLE_R;
            }
          // fall through
          case 62: break;
          case 19:
            { return OP_OPTIONAL;
            }
          // fall through
          case 63: break;
          case 20:
            { return AT;
            }
          // fall through
          case 64: break;
          case 21:
            { return SYMBOL;
            }
          // fall through
          case 65: break;
          case 22:
            { return BRACKET_L;
            }
          // fall through
          case 66: break;
          case 23:
            { return BRACKET_R;
            }
          // fall through
          case 67: break;
          case 24:
            { return OP_REMARK;
            }
          // fall through
          case 68: break;
          case 25:
            { return BRACE_L;
            }
          // fall through
          case 69: break;
          case 26:
            { return OP_OR;
            }
          // fall through
          case 70: break;
          case 27:
            { return BRACE_R;
            }
          // fall through
          case 71: break;
          case 28:
            { return OP_CONCAT;
            }
          // fall through
          case 72: break;
          case 29:
            { return TEXT_DOUBLE;
            }
          // fall through
          case 73: break;
          case 30:
            { return TEXT_SINGLE;
            }
          // fall through
          case 74: break;
          case 31:
            { return TO;
            }
          // fall through
          case 75: break;
          case 32:
            { return COMMENT_LINE;
            }
          // fall through
          case 76: break;
          case 33:
            { return REGULAR_RANGE;
            }
          // fall through
          case 77: break;
          case 34:
            { return ESCAPED;
            }
          // fall through
          case 78: break;
          case 35:
            { return SYMBOW_RAW;
            }
          // fall through
          case 79: break;
          case 36:
            { return KW_AS;
            }
          // fall through
          case 80: break;
          case 37:
            { return REGULAR_EXPRESSION;
            }
          // fall through
          case 81: break;
          case 38:
            { return COMMENT_BLOCK;
            }
          // fall through
          case 82: break;
          case 39:
            { return KW_UNION;
            }
          // fall through
          case 83: break;
          case 40:
            { return KW_CLASS;
            }
          // fall through
          case 84: break;
          case 41:
            { return KW_GROUP;
            }
          // fall through
          case 85: break;
          case 42:
            { return KW_MACRO;
            }
          // fall through
          case 86: break;
          case 43:
            { return KW_IMPORT;
            }
          // fall through
          case 87: break;
          case 44:
            { return KW_GRAMMAR;
            }
          // fall through
          case 88: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
