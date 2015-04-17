#!/bin/bash

REMOTE=root@2big2slim.linuxd.org
REMOTE_APP=/root/team2big2slim

./activator stage || exit 1;
rsync -va target/ $REMOTE:$REMOTE_APP/target;
ssh $REMOTE "cd $REMOTE_APP; ./stop.sh";
ssh $REMOTE "cd $REMOTE_APP; ./start.sh";