<div data-purpose="safely-set-inner-html:rich-text-viewer:html" class="instructions--description--2Qd_w"><p>We have a dog that likes to bark.&nbsp; We need to wake up if the dog is barking at night!</p><p>Write a method&nbsp;<strong>shouldWakeUp&nbsp;</strong>that has&nbsp;<strong>2 parameters.</strong></p><p><strong>1st parameter&nbsp;</strong>should be of type&nbsp;<strong>boolean&nbsp;</strong>and be named<strong>&nbsp;</strong>barking&nbsp;it represents if our dog is currently barking.<br><strong>2nd parameter&nbsp;</strong>represents the&nbsp;<strong>hour of the day</strong>&nbsp;and is of type&nbsp;<strong>int</strong>&nbsp;with the name&nbsp;<strong>hourOfDay</strong>&nbsp;and has a valid range of&nbsp;<strong>0-23</strong>.<br><br>We have to wake up if the dog is barking&nbsp;<strong>before 8 or after 22 hours</strong>&nbsp;so in that case&nbsp;<strong>return&nbsp;true</strong>.<br><br>In all other cases&nbsp;<strong>return false</strong>.<br><br>If the hourOfDay parameter is&nbsp;<strong>less than 0</strong>&nbsp;or&nbsp;<strong>greater than 23</strong>&nbsp;return&nbsp;<strong>false</strong>.</p><p><strong>Examples of input/output:</strong></p><ul><li><p><code><strong>shouldWakeUp&nbsp;(true, 1);</strong></code>&nbsp;→&nbsp;should return&nbsp;<strong>true</strong></p></li><li><p><code><strong>shouldWakeUp&nbsp;(false, 2);</strong></code>&nbsp;→&nbsp;should return false since the&nbsp;<strong>dog is not barking</strong>.</p></li><li><p><code><strong>shouldWakeUp&nbsp;(true, 8);</strong></code>&nbsp;→&nbsp;should return false, since it's not before 8.</p></li><li><p><code><strong>shouldWakeUp&nbsp;(true, -1);</strong></code>&nbsp;→&nbsp;should return false since the&nbsp;<strong>hourOfDay</strong>&nbsp;parameter needs to be in a range&nbsp;<strong>0-23</strong>.</p></li></ul><p><br></p><p><strong>TIP:</strong>&nbsp;Use the if else statement with multiple conditions.</p><p><strong>NOTE:</strong>&nbsp;The&nbsp;<strong>shouldWakeUp </strong>method&nbsp;&nbsp;needs to be defined as<strong>&nbsp;</strong>public static&nbsp;​like we have been doing so far in the course.</p><p><strong>NOTE:</strong>&nbsp;Do not add a&nbsp;&nbsp;<strong>main&nbsp;</strong>method to solution code.</p></div>
